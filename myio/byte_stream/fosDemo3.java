package byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class fosDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("myio\\a.txt",true);//第二个参数为续写开关,此时创建对象不会清空

        String str="abc";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        String wrap="\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        String str2="666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);


        fos.close();
    }
}
