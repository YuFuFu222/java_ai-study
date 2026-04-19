public class q1855 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        int n=Math.min(nums2.length, nums1.length);
        int i=n-1;
        for (int j = nums2.length; j >=0 ; j--) {
            int right=nums2[j];
            while(i>=0&&right>=nums1[i]){
                ans=Math.max(ans,j-i);
                i--;
            }
        }
        return ans;
    }
}
