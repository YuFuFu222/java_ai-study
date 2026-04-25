package byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fisDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象,文件必须存在,否则报错
        FileInputStream fis=new FileInputStream("myio\\a.txt");
        int b1 = fis.read();
        //一次只读一个细节
        //读到末尾返回-1
        //会读取空格,换行
        //读取一个数据,就移动一次指针
        //System.out.println(b1);//97
        System.out.println((char) b1);
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char)b);
        }


        fis.close();
    }
}
