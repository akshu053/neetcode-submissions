class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int n = nums.length;

        for(int i=0; i<n; i++){
            int curr = 0;
            for(int j=i; j<n; j++){
                curr += nums[j];
                res = Math.max(curr, res);
            }
        }

        return res;
    }
}
