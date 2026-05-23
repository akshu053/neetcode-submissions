class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //1. sort the string and sorted str would be the key, anagrams -> value
        Map<String, List<String>> freqMap = new HashMap<>();

        for(String s : strs){
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String sortedS = new String(sorted);
            freqMap.putIfAbsent(sortedS, new ArrayList<>());

            freqMap.get(sortedS).add(s);
        }

        return new ArrayList<>(freqMap.values());
    }
}
