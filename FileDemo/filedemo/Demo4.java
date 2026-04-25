package filedemo;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
            public boolean createNewFile()    创建一个新的空的文件
            public boolean mkdir()            创建单级文件夹
            public boolean mkdirs()           创建多级文件夹
            public boolean delete()           删除文件、空文件夹
        */

        //1.createNewFile

        File f1=new File("D:\\aaa\\c.txt");
        boolean b=f1.createNewFile();
        System.out.println(b);

        //第一次是true,后面是false(已存在,创建失败)
        //如果父级路径不存在,会有异常
        //创建的一定是文件,若路径无后缀名,则创建一个没有后缀的文件

        //2.mkdir
        //windows中路径唯一,如果当前路径存在,则创建失败
        //只能创建单级文件夹

        File f2=new File("D:\\aaa\\ddd");
        boolean b2 = f2.mkdir();
        System.out.println(b2);//false 路径已存在

        File f3=new File("D:\\aaa\\eee");
        boolean b3 = f3.mkdir();
        System.out.println(b3);//true

        File f4=new File("D:\\aaa\\bbb\\ccc\\cc");
        boolean b4=f4.mkdir();
        System.out.println(b4);//false 无法创建多级

        //3.mkdirs
        //只用这个,mkdir白学嘻嘻
        File f5=new File("D:\\aaa\\bbb\\fff\\ff");
        boolean b5=f5.mkdirs();
        System.out.println(b5);//true



    }
}
