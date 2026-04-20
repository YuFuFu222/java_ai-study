package functiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        /*
        3.创建集合添加学生对象
        把姓名年龄拼接成: 张三-23的字符串,并放到数组当中
         */
        ArrayList<Student> list3=new ArrayList<>();
        list3.add(new Student("张三",23));
        list3.add(new Student("李四",24));
        list3.add(new Student("王五",25));

        String[] newList3 = list3.stream()
                .map(Student::toStringRule)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(newList3));


    }
}
