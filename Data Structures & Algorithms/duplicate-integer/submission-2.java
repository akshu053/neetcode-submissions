class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> resSet = new HashSet<>();

        for(int i : nums){
            if(!resSet.add(i)){
                return true;
            }
        }

        return false;

    }
}