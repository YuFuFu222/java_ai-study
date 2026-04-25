package filedemo;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        File file =new File("D:\\aaa\\bbb");
        deletes(file);
    }

    public static void deletes(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else deletes(file);
        }
        src.delete();
    }
}
