import java.util.*;

public class ImmutableDemo {
    public static void main(String[] args) {
        //创建不可变list集合
        List<String> list = List.of("张三", "李四", "王五");
        //注意:Map的of有参数数量限制,最多10个键值对
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("--------------------------");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Set<String> set = Set.of("张三", "李四", "王五");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("____________________________________");

        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> m:entries){
            System.out.println(m);
        }
        map.forEach((k,v)-> System.out.println(k+" "+v));
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
        HashMap<Integer,String > goods1=new HashMap<>();
        goods1.put(3,"a");
        goods1.put(4,"e");
        goods1.put(5,"d");
        goods1.put(2,"c");
        goods1.put(1,"b");
        Set<Map.Entry<Integer, String>> gn = goods1.entrySet();
        Map.Entry[] arr = gn.toArray(new Map.Entry[0]);
        Map goodmap = Map.ofEntries(arr);

        Map<Object, Object> goodmap2 = Map.ofEntries(goods1.entrySet().toArray(new Map.Entry[0]));
        Map<Integer, String> goodmap3 = Map.copyOf(goods1);
        System.out.println(goodmap);
        System.out.println(goodmap2);
        System.out.println(goodmap3);

    }
    //如果我要让这个方法接受多个键和值
    //键:可变参数, 值:可变参数
    //类型不确定:泛型方法
    //public static<K,V> void of(K...keys,V...values)
    //没法写啊
    //用Map.ofEntries()
}
