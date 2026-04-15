import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class practice2 {
    public static void main(String[] args) {
        HashMap<String , ArrayList<String >> hm =new HashMap<>();
        ArrayList<String > city1=new ArrayList<>();
        Collections.addAll(city1,"赣州","九江","南昌");

        ArrayList<String > city2=new ArrayList<>();
        Collections.addAll(city2,"潮汕","广州","惠州");
        hm.put("江西省",city1);
        hm.put("广东省",city2);
        //System.out.println(hm);
        hm.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String s, ArrayList<String> strings) {
                System.out.println(s+" = "+strings);
            }
        });

        hm.forEach((s, strings)-> System.out.println(s+" = "+strings));

        for (Map.Entry<String ,ArrayList<String>> entry : hm.entrySet()){
            String k=entry.getKey();
            ArrayList<String> v=entry.getValue();
            StringBuilder sb=new StringBuilder();
            sb.append(k+" = ");
            for (String s:v){
                sb.append(s+", ");
            }
            System.out.println(sb);
        }
    }
}
