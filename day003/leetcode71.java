import java.util.ArrayDeque;
import java.util.Deque;


public class leetcode71 {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Deque<String > stk=new ArrayDeque<>();
        for (String s : str) {
            if(s=="."||s.isEmpty()) continue;
            if(!s.equals("..")){
                stk.push(s);
            }else if(!stk.isEmpty()){
                stk.pop();
            }
        }
        stk.reversed();
        return "/"+String.join("/",stk);
    }
}
