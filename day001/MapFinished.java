import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapFinished {
    public static void main(String[] args) {
        System.out.println("day001 学习开始！");
        var hm=new HashMap<Integer,Integer>();
        //LinkedHashMap:有序 不重复 无索引
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("a",123);
        lhm.put("a",111);
        lhm.put("b",456);
        lhm.put("c",789);
        System.out.println(lhm);
        //TreeMap:红黑树底层,不重复,无索引,可排序
        //对键进行排序,默认从小到大,可写排序规则:Comparable接口,或Comparator比较器对象,两种都有时,优先后者
        TreeMap<Integer,String> goods1=new TreeMap<>();
        TreeMap<Integer,String> goods2=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        TreeMap<Student,String> tm =new TreeMap<>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        tm.put(s1,"江苏");
        tm.put(s2,"天津");
        tm.put(s3,"北京");

        System.out.println(tm);

        goods1.put(3,"a");
        goods1.put(4,"e");
        goods1.put(5,"d");
        goods1.put(2,"c");
        goods1.put(1,"b");
        goods2.put(3,"a");
        goods2.put(4,"e");
        goods2.put(5,"d");
        goods2.put(2,"c");
        goods2.put(1,"b");
        //System.out.println(goods1);
        //System.out.println(goods2);

        String s="aababcabcdabcde";
        TreeMap<Character,Integer> tr=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            tr.merge(c,1,Integer::sum);
        }
        System.out.println(tr);
        //遍历
        StringBuilder sb=new StringBuilder();
        tr.forEach((Character k, Integer v)-> sb.append(k).append("(").append(v).append(")") );


        System.out.println(sb);



    }
}
