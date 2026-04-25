package filedemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        //public File[] listFiles()      获取当前路径下所有内容

        //1.创建File对象
        File f = new File("D:\\aaa");
        //2.listFiles方法
        //作用：获取aaa文件夹里面的所有内容，把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            //file依次表示aaa文件夹里面的每一个文件或者文件夹
            System.out.println(file);
        }
        /*
    public File[] listFiles(FileFilter filter)       利用文件名过滤器获取当前该路径下所有内容
    public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
    */
        File[] files1 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files1));

        System.out.println("==============================");

        File[] files2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {//父级路径,子级路径
                File src=new File(dir,name);
                return src.isFile()&&name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files2));
    }
}
