package filedemo;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        /*
            public boolean isDirectory()      判断此路径名表示的File是否为文件夹
            public boolean isFile()           判断此路径名表示的File是否为文件
            public boolean exists()           判断此路径名表示的File是否存在
        */

            //1.对一个文件的路径进行判断
        File f1=new File("D:\\aaa\\a.txt");
        System.out.println(f1.exists()); //t
        System.out.println(f1.isDirectory()); //f
        System.out.println(f1.isFile()); //t
        //2.对一个文件夹的路径进行判断
        File f2=new File("D:\\aaa\\bbb");
        System.out.println(f2.exists()); //t
        System.out.println(f2.isDirectory()); //t
        System.out.println(f2.isFile()); //f

            //3.对一个不存在的路径进行判断
        File f3=new File("D:\\aaa\\c.txt");
        System.out.println(f3.exists());//f
        System.out.println(f3.isDirectory());//f
        System.out.println(f3.isFile());//f


    }

}
