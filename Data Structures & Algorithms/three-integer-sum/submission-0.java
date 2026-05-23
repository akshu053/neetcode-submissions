class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        //[-4, -1, -1, 0, 1, 2]

        for(int i=0; i<nums.length-2; i++){

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0){
                    l++;
                }else if(sum > 0){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l<r){
                        l++;
                    }
                }
            }

        }

        return res;

    }
}
