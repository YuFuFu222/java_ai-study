import java.util.ArrayDeque;

public class q1047 {
    public String removeDuplicates(String s) {
        var stk=new ArrayDeque<Character>();
        for (char c : s.toCharArray()) {
            if(stk.size()>0&&c==stk.peek()){
                stk.pop();
            }else stk.push(c);
        }
        StringBuilder sb=new StringBuilder();

        for (Character c : stk.reversed()) {
            sb.append(c);
        }
        return sb.toString();
    }
}
