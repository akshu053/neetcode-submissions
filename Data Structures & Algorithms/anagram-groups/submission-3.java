class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            char[] arr = new char[26];
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }

            String str = Arrays.toString(arr);

            res.putIfAbsent(str, new ArrayList<>());

            res.get(str).add(s);

        }

        return new ArrayList<>(res.values());

    }
}
