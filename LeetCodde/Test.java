public class Test {
    public static void main(String[] args) {
        int t=12;
        int res;
        StringBuilder sb=new StringBuilder();
        sb.append(t);
        res=Integer.parseInt(sb.reverse().toString());
        System.out.println(res);
    }
}
