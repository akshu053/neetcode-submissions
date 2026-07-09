class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        //nums = 2 1 2, k = 1

        //if k = 4, then 0, 1, 2 , 3, 4

        for(int i=0; i<nums.length; i++){

            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }

        return false;

    }
}