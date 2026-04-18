import java.util.ArrayDeque;

public class q155 {
    private ArrayDeque<int[]> stk;
    public void MinStack() {
        stk=new ArrayDeque<>();
        stk.push(new int[]{0,Integer.MAX_VALUE});
    }

    public void push(int val) {
        int min=Math.min(getMin(),val);
        stk.push(new int[]{val,min});

    }

    public void pop() {
        stk.pop();

    }

    public int top() {
        return stk.peek()[0];
    }

    public int getMin() {
        return stk.peek()[1];
    }
}
