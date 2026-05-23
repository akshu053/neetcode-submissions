class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer>[] freqArr = new List[n+1];
        for(int i=0; i<=n; i++){
            freqArr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            freqArr[value].add(key);
        }

        int count = 0;
        for(int i=n; i>0 && count<k; i--){
            for(int val : freqArr[i]){
                res[count++] = val;
            }
            if(count == k){
                return res;
            }
        }

        return res;
        

    }
}
