import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class q2615 {
    static long[] ans;
    public long[] distance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ans=new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //check(nums[i],hm,i);
            if(hm.containsKey(nums[i])){
                hm.get(nums[i]).add(i);
            }else {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                hm.put(nums[i],list);
            }
        }
        for (ArrayList<Integer> arr : hm.values()) {
            int size = arr.size();
            long[] prefix = new long[size + 1];

            // 构建前缀和
            for (int i = 0; i < size; i++) {
                prefix[i+1] = prefix[i] + arr.get(i);
            }

            // 计算每一个下标的距离和
            for (int i = 0; i < size; i++) {
                int idx = arr.get(i);
                long left = (long) idx * i - prefix[i];
                long right = (prefix[size] - prefix[i+1]) - (long) idx * (size - i - 1);
                ans[idx] = left + right;
            }
        }
        return ans;
    }
    /*public static void check(int n,HashMap<Integer, ArrayList<Integer>> hm,int i){
        if(hm.containsKey(n)){
            ArrayList<Integer> arr=hm.get(n);
            for (int j = 0; j < arr.size(); j++) {
                int index=arr.get(j);
                ans[index]+=Math.abs(index-i);
                ans[i]+=Math.abs(index-i);
            }
        }
    }*/
}
