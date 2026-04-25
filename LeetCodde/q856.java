import java.util.ArrayDeque;

public class q856 {
    public int scoreOfParentheses(String s) {
        //var stk=new ArrayDeque<Character>();
            char[] charArray = s.toCharArray();
            boolean check=false;
            int sum=0,t=0;
            for (char c : charArray) {
                if(c=='('){
                    check=false;
                    t=0;
                }else {
                    if(check==false){
                        t++;
                        check=true;
                        sum+=t;
                    }else {
                        sum+=t;
                        t*=2;
                    }
                }
            }
            return sum;
    }
}

