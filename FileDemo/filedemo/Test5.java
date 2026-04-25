package filedemo;

import java.io.File;
import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        File src = new File("D:\\");
        HashMap<String,Integer> hm=new HashMap<>();
        getFilesKinds(src,hm);
        System.out.println(hm);
    }

    public static void getFilesKinds(File src, HashMap<String,Integer> hm){
        File[] files = src.listFiles();

        if(files!=null){//如果存在需要权限才能访问的文件,files会为空,若不处理,会抛出空指针异常
            for (File file : files) {
                if(file.isFile()){
                    String name= file.getName();
                    String[] arr = name.split("\\.");
                    if(arr.length>=2){
                        String endName=arr[arr.length-1];
                        if(hm.containsKey(endName)){
                            hm.merge(endName,1,Integer::sum);
                        }else {
                            hm.put(endName,1);
                        }
                    }
                }else {
                    getFilesKinds(file,hm);
                }
            }
        }

    }
}
