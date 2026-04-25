package filedemo;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //找文件夹里是否有.png文件
        //暂时不考虑子文件夹
        File file=new File("D:\\aaa\\ccc");
        System.out.println(hasPng(file));
    }
    public static boolean hasPng(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            //f:依次表示文件夹内的文件或文件夹
            if(f.isFile()&&f.getName().endsWith(".png")){
                return true;
            }
        }
        return false;
    }
}
