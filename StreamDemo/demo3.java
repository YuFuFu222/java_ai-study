import java.util.ArrayList;
import java.util.Collections;


public class demo3 {
    public static void main(String[] args) {
        /*
        filter  过滤
        limit   获取前几个元素
        skip    跳过前几个元素
        注意:中间方法,返回新的Stream流,原来的Stream流只能用一次,建议使用链式编程
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周伞","赵明","张强","张三分","张脆山","张良","王二麻子","谢广坤");
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回true:当前数据留下
                //false:当前数据舍弃
                //return false;
                return s.startsWith("张");
            }
        }).forEach(s-> System.out.println(s));*/
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        System.out.println("---------------------------");
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("---------------------------");
        list.stream().skip(4).forEach(s-> System.out.println(s));
        System.out.println("---------------------------");
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
    }
}
