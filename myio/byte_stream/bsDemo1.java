package byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bsDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        文件拷贝
        把D:\aaa\b.txt拷贝到当前模块
         */

        //1.创建对象
        FileInputStream fis=new FileInputStream("D:\\aaa\\b.txt");
        FileOutputStream fos=new FileOutputStream("myio\\b.txt");
        //2.拷贝
        //核心思想:边读边写
        int b;
        long start=System.currentTimeMillis();
        while ((b=fis.read())!=-1){//一次只读写一个字节,速度慢
            fos.write(b);
        }
        long finish=System.currentTimeMillis();
        System.out.println(finish-start);

        //改进,用read(byte[] buffer)
        byte[] bytes=new byte[2];//推荐1024*1024 即MB
        //返回值:本次读取到了多少个字节数据
        int len;
        while((len=fis.read(bytes))>0){
            fos.write(bytes,0,len);
        }



        //3.释放资源,先开的后释放
        fos.close();
        fis.close();
    }
}
