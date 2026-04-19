import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        /*
        1.单列集合:  default Stream<E> stream()
        2.双列集合:   无
        3.数组:       public static <T> Stream<T> stream(T[] array)
        4.零散数据:    public static<T> Stream<T> of(T...values) 需要是同种数据类型
         */
        //单列集合
        ArrayList<String > list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g","h");
        Stream<String> stream1 = list.stream();//集合数据存入
       /* //用终结方法打印流水线数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.stream().forEach(s-> System.out.println(s));

        //双列集合,转化为单列集合
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        hm.keySet().stream().forEach(s-> System.out.println(s));
        hm.entrySet().stream().forEach(s-> System.out.println(s));

        //数组
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        String[] arr2={"a","b","c"};
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        System.out.println("__________________________");
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
        //零散数据
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        //形参是可变参数,本质数组,所以数组也能用Stream.of,但数组不能是基本数据类型,只能引用数组类型
        //如果传基本数据类型,会把整个数组当作一个元素,放到stream中
    }
}
