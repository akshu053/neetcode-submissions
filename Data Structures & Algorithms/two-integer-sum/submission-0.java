class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    res[0] = Math.min(i, j);
                    res[1] = Math.max(i, j);
                }
            }
        }

        return res;

    }
}
