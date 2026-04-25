package filedemo;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
    //找电脑是否有.png文件
    //考虑子文件夹
        File src = new File("C:\\");
        //findPng(src);
        findPng();
    }
    public static void findPng(File src){
        File[] files = src.listFiles();
        if(files!=null){//如果存在需要权限才能访问的文件,files会为空,若不处理,会抛出空指针异常
            for (File file : files) {
                if(file.isFile()){
                    if (file.getName().endsWith(".png")){
                        System.out.println(file);
                    }
                }else {
                    findPng(file);
                }
            }
        }
    }

    public static void findPng(){
        //获取所有盘符
        File[] arr=File.listRoots();
        for (File file : arr) {
            findPng(file);
        }
    }
}
