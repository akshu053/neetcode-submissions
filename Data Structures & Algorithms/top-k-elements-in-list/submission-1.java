class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0; i<=nums.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            int key = val.getKey();
            int value = val.getValue();

            freq[value].add(key);
        }

        int count = 0;
        for(int i=nums.length; i>0 && count<k; i--){
            for(int val : freq[i]){
                res[count++] = val;
            }
            if(count == k){
                return res;
            }
        }

        return res;

    }
}
