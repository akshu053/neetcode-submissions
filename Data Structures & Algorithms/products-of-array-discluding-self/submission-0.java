class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length;){
                if(i != j){
                    product = product * nums[j];
                }
                j++;
            }
            res[i] = product;
            product = 1;
        }
        return res;
    }
}  
