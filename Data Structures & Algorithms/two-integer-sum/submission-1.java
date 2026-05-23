class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = Math.min(i, map.get(target-nums[i]));
                res[1] = Math.max(i, map.get(target-nums[i]));
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
