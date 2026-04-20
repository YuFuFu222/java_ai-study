public class q2078 {
    public int maxDistance(int[] colors) {
        int ans=0;
        int n=colors.length;
        for (int i = 0; i <n-2 ; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                if(colors[i]!=colors[j]) ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }
}
