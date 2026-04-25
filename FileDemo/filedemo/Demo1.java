package filedemo;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, String child)      根据父路径对应文件对象和子路径名字符串创建文件对象

        C:\Users\alienware\Desktop
        */

        //1.根据字符串表示的路径，变成File对象
        String str="C:\\Users\\alienware\\Desktop\\a.txt";
        File f1=new File(str);
        System.out.println(f1);//C:\Users\alienware\Desktop\a.txt

        //2.父级路径:C:\Users\alienware\Desktop
        //子级路径:a.txt
        String parent="C:\\Users\\alienware\\Desktop";
        String child="a.txt";
        File f2=new File(parent,child);
        System.out.println(f2);//C:\Users\alienware\Desktop\a.txt
        //等价于(不完全等价)
        File nf2=new File(parent+"\\"+child);

        //3.把一个File表示的路径,和String路径进行拼接
        File parent2=new File("C:\\Users\\alienware\\Desktop");
        File f3=new File(parent2,child);
        System.out.println(f3);//C:\Users\alienware\Desktop\a.txt
    }
}
