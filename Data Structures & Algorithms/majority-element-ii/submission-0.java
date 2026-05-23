class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = (nums.length)/3;

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> x : freqMap.entrySet()){
            if(x.getValue() > count){
                res.add(x.getKey());
            }
        }

        return res;
    }
}