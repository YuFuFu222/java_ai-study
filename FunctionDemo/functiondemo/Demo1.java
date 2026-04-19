package functiondemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr={3,5,4,1,6,2};
        //需求:倒序排序
        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        //lambda表达式
        //因为第二个参数类型Comparator是一个函数式接口
        Arrays.sort(arr,((o1, o2) -> o2-o1));

        //方法引用
        //引用处必须是函数式接口,被引用方法必须存在
        Arrays.sort(arr,Demo1::subtraction);
    }
    public static int subtraction(int n1,int n2){
        return n2-n1;
    }
}
