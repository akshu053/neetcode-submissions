class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int maxSeq = 1;
        int count = 1;

        if(nums == null || n == 0){
            return 0;
        }

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int ele : set){
            if(set.contains(ele-1)){
                continue;
            }
            count = 1;
            while(set.contains(ele+1)){
                count++;
                ele++;
            }
            maxSeq = Math.max(maxSeq, count);
        }

        return maxSeq;
    }
}
