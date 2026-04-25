import java.util.ArrayList;
import java.util.List;
public class q2452 {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (check(queries[i],dictionary[j])){
                    list.add(queries[i]);
                    break;
                }
            }
        }

        return list;
    }
    public static boolean check(String a,String b ){
        int count=0;
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if(ac[i]!=bc[i]) count++;
        }
        if(count>2) return false;
        else return true;
    }
}
