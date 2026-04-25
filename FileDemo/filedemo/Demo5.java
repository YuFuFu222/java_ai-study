package filedemo;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        //public boolean delete() 删除文件,空文件夹
        File f1=new File("D:\\aaa\\a.txt");
        System.out.println(f1.delete());
        File f2=new File("D:\\aaa\\bbb");
        System.out.println(f2.delete());
        //无法删除有内容的文件夹
    }
}
