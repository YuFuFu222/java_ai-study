package filedemo;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建a.txt的父级路径
        File file=new File("D:\\java_ai--study\\java-study\\FileDemo\\aa");
        file.mkdirs();
        //如果aa存在,创建失败
        //如果aa不存在,创建成功
        File src=new File(file,"a.txt");
        boolean b = src.createNewFile();
        if (b){
            System.out.println("创建成功");
        }else System.out.println("创建失败");

    }
}
