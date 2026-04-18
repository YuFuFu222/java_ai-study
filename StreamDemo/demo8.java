import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo8 {
    public static void main(String[] args) {
        ArrayList<String > manList=new ArrayList<>();
        ArrayList<String > womanList=new ArrayList<>();
//        1. 男演员只要名字为3个字的前两人
//        2. 女演员只要姓杨的，并且不要第一个
//        3. 把过滤后的男演员姓名和女演员姓名合并到一起
//        4. 将上一步的演员姓名封装成Actor对象。
//        5. 将所有的演员对象都保存到List集合中。
//        备注：演员类Actor，属性有：name，age
        Collections.addAll(manList,"蔡坤坤,24", "叶舸咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womanList,"赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);


        Stream<String> stream2 = womanList.stream()
                .filter(s -> s.startsWith("杨"))
                .skip(1);

        //        3. 把过滤后的男演员姓名和女演员姓名合并到一起
        //        4. 将上一步的演员姓名封装成Actor对象。
        //String -> Actor

//        Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String name=s.split(",")[0];
//                int age=Integer.parseInt(s.split(",")[1]);
//                return new Actor(name,age);
//            }
//        }).forEach(s-> System.out.println(s));
        //lambda,Z注意stream1和stream2只能用一次,用了concat方法后stream1和stream2会关流
        List<Actor> List = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(List);


    }
}
