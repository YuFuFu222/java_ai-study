package functiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        /*
        引用静态方法
            类::方法名
        需求
            把集合中数字变成int类型
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //常规方法

//        ArrayList<Integer> list2=new ArrayList<>();
//        for (String s : list) {
//            list2.add(Integer.parseInt(s));
//        }

        //方法引用

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(s-> System.out.println(s));

        List<Integer> newlist2 = list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(newlist2);


    }

}
