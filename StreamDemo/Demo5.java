import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo5 {
    public static void main(String[] args) {
        /*
        终结方法:
            void forEach(Consumer action)   遍历
            long count()    统计
            toArray()       收集流中数据到数组中
            collect(Collector collector) 收集流中数据到集合中
         */
        ArrayList<String > list1=new ArrayList<>();
        Collections.addAll(list1,"a","b","c","d","e");
        //count
        System.out.println(list1.stream().count());
        //toArray
        Object[] arr1 = list1.stream().toArray();//空参为Object类型
        System.out.println(Arrays.toString(arr1));
        //IntFunction的泛型:具体类型的数组
        //apply的形参:流中数据的个数,要跟数组长度保持一致
        //apply的返回值:具体类型的数组
        //方法体:创建数组
        String[] arr = list1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        //toArray方法的参数作用:创建一个指定类型的数组
        //底层:依次得到每一个数据放到数组中
        String[] arr2 = list1.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

    }
}
