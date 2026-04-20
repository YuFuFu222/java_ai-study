package functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        /*
        以下均用方法引用
        1.集合中存储数据如"张三,23",收集到Student类型数组中
         */
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张三,23","李四,24");
        Student[] newList1 = list1.stream()
                .map(Student::new)
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(newList1));

        /*
        2.创建集合添加学生对象,获取姓名并添加到数组当中
         */
        ArrayList<Student> list2=new ArrayList<>();
        list2.add(new Student("zhangsan",23));
        list2.add(new Student("lisi",24));
        list2.add(new Student("wangwu",25));
        /*String[] newList2 = list2.stream()
                .map(new Function<Student, String>() {
                    @Override
                    public String apply(Student student) {
                        return student.getName();
                    }
                }).toArray(String[]::new);*/

        String[] newList2 = list2.stream()
                .map(Student::getName)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(newList2));

    }
}
