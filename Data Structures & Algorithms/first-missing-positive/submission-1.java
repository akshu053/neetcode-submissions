class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        //first loop for converting invalid numbers to something safe
        for(int i=0; i<n; i++){
            if(nums[i] <= 0 || nums[i] > n+1){
                nums[i] = n+1;
            } 
        }

        for(int i=0; i<n; i++){
            int val = Math.abs(nums[i]);
            if(val <= n){
                int index = val - 1;
                if(nums[index] > 0){
                    nums[index] = nums[index] * (-1);
                }
                
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }

        return n+1;
    }
}