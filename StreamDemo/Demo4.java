import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        /*
        distinct    元素去重,依赖hashCode和equals方法   底层HashSet
        concat      合并a和b两个流为一个流,若类型不同,变为二者共同父类
        map:        转换流中的类型
         */
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,1,2,3,1,2);
        ArrayList<Integer> list2=new ArrayList<>();
        Collections.addAll(list2,4,5,6);
        list1.stream().distinct().forEach(s-> System.out.println(s));
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));
        ArrayList<String > list=new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周之-14","赵名-13","张强-20");
        //需求:只获取里面的年龄并打印
        //String->int

        //第一个类型:流中原本的类型
        //第二个类型:要转成的类型,默认为Object,只能改为引用数据类型
        //apply的形参s:依次表示流里面的每一个数据
        //返回值:表示转换之后的数据
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age=Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));//forEach里面的s已经map过后的数据了
        System.out.println("-----------------------------------");
        list.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
