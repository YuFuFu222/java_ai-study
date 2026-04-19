import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {
        //collect(Collector collector) 收集流中数据到集合中
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周之-女-14","赵名-男-13","张强-女-20","李美-女-18");
        //所有男性收集到List集合中
        list.stream().filter(s->"男".equals(s.split("-")[1])).forEach(s-> System.out.println(s));

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList);

        //收集到set集合(可去重)
        Set<String> newList2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newList2);

        //收集到Map集合
        //键:姓名,值:年龄
        //Collectors.toMap(键的规则,值的规则)
        //注意: 键不能重复,否则报错

        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                键:泛型1:流中数据类型  泛型2:键的数据类型
                    apply形参:依次表示流里每一个数据
                        方法体:生产键的代码
                        返回值:键

                值:同上

                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
        System.out.println(map);

        Map<String, Integer> map2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);
    }
}
