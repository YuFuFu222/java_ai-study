import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6,7,8,9,10);
        List<Integer> newList1 = list1.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList1);
        System.out.println("------------------");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"zhangsan,23","lisi,24","wangwu,25");
        Map<String, Integer> newList2 = list2.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(newList2);
        System.out.println("------------------");



    }
}
