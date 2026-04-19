import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("陈飞");
        list.add("李明");
        list.add("赵云");
        list.add("张三丰");
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
        System.out.println(list);
    }
}
