package byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class fosDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b)                一次写一个字节数据
            void write(byte[] b)              一次写一个字节数组数据
            void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
            参数一：数组
            参数二：起始索引 0
            参数三：个数   3
         */

        //1.创建对象
        FileOutputStream fos=new FileOutputStream("myio\\a.txt");
        //2.写出数据
        fos.write(97);
        fos.write(98);
        byte[] b= {97,98,99,100};
        fos.write(b);
        fos.write(10);
        fos.write(b,0,3);
        //3.释放资源
        fos.close();





    }
}
