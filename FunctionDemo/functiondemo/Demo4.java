package functiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Demo4 {
    public static void main(String[] args) {
        /*
        引用构造方法
            格式  类名::new
            例子  Student::new
         */
        ArrayList<String > list=new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周之,14","赵名,13","张强,20");
        //把集合里的姓名年龄封装成Student对象,并收集到List集合中
        List<Student> newList1 = list.stream()
                .map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        })
                .collect(Collectors.toList());
        System.out.println(newList1);

        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);


    }

}
