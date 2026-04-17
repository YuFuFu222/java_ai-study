import java.util.HashMap;
import java.util.Map;

public class q3761 {
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        int ans=n+1;
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr=nums[i];
            if(hm.containsKey(curr)){
                ans=Math.min(i-hm.get(curr),ans);
                hm.put(curr,i);
            }
                hm.put(rev(curr),i);

        }
            if (ans==n+1) return -1;
            return ans;
    }
    private int rev(int t){
        int res=0;
        StringBuilder sb=new StringBuilder();
        sb.append(t);
        res=Integer.parseInt(sb.reverse().toString());
        return res;
    }
}
