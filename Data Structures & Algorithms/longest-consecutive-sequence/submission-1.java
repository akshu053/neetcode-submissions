class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int num : nums){
            set.add(num);
        }

        for(int val : set){
            if(!set.contains(val - 1)){
                int x = val;
                int cnt = 1;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }
        }

        return longest;
    }
}
