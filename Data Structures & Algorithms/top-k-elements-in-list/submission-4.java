class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer>[] bucket = new List[n+1];
        for(int i = 0; i<=n; i++){
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            int key = x.getKey();
            int value = x.getValue();
            bucket[value].add(key);
        }

        int count = 0;
        for(int j=n; j>0 && count<k; j--){
            for(int val : bucket[j]){
                res[count++] = val;
            }
            if(count == k){
                return res;
            }
        }

        return res;


    }
}
