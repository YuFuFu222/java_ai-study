import java.util.ArrayList;

public class q2696 {
    public int minLength(String S) {
        char[] s=S.toCharArray();
        ArrayList<Character> stk=new ArrayList<>();
        for (char c : s) {
            stk.add(c);
            if(stk.size()>1&&((stk.get(stk.size()-2)=='A'&&stk.getLast()=='B')||(stk.get(stk.size()-2)=='C'&&stk.getLast()=='D'))){
                stk.removeLast();
                stk.removeLast();
            }
        }
        return stk.size();
    }
}
