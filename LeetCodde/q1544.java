public class q1544 {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray()) {
            int n=sb.length();
            if (n > 0 &&c!= sb.charAt(n-1)&&( c == Character.toLowerCase(sb.charAt(n - 1))|| c == Character.toUpperCase(sb.charAt(n - 1)))) {
              sb.deleteCharAt(n-1);

            }else sb.append(c);
        }
        return sb.toString();
    }
}
