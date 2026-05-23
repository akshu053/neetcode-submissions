class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            char[] arr = new char[26];
            String ogStr = s;
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }

            String str = new String(arr);

            res.putIfAbsent(str, new ArrayList<>());

            res.get(str).add(ogStr);

        }

        return new ArrayList<>(res.values());

    }
}
