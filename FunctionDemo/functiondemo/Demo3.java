package functiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        /*
        引用成员方法
            格式
                其他类:  其他类对象::方法名
                本类:    this::方法名 (静态方法没有this和super哦)
                父类:    super::方法名
        集合中有一些名字,按要求过滤
        张开头,三个字
        */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        list.stream().filter(new StringOperation()::stringJudge);



    }
}
