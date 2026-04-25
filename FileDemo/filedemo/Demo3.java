package filedemo;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        /*
            public long length()                 返回文件的大小（字节数量）
            public String getAbsolutePath()      返回文件的绝对路径
            public String getPath()              返回定义文件时使用的路径
            public String getName()              返回文件的名称，带后缀
            public long lastModified()           返回文件的最后修改时间（时间毫秒值）
        */

        File f1=new File("D:\\aaa\\a.txt");
        File f2=new File("D:\\aaa\\bbb");
        //1.length() 返回文件大小
        //细节:只能获取文件的大小,单位是字节,无法获取文件夹大小
        //可不断除以1024转换单位
        //如果要获取文件夹大小,需要把这个文件夹里所有文件大小累加
        System.out.println(f1.length());
        System.out.println(f2.length());
        System.out.println("=================================");

        //2.getAbsolutePath
        System.out.println(f1.getAbsoluteFile());//D:\aaa\a.txt
        File f3=new File("FileDemo/filedemo/a.txt");
        System.out.println(f3.getAbsoluteFile());//D:\java_ai--study\java-study\FileDemo\filedemo\a.txt

        System.out.println("===================================");
        //3.getPath
        System.out.println(f1.getPath());//D:\aaa\a.txt
        System.out.println(f3.getPath());//FileDemo\filedemo\a.txt

        System.out.println("=======================================");
        //4.getName
        System.out.println(f1.getName());//a.txt
        System.out.println(f2.getName());//bbb

        System.out.println("=======================================");
        //5.lastModified
        System.out.println(f1.lastModified());//1776750839057
    }
}
