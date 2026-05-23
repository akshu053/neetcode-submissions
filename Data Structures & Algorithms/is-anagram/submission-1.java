class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqArr = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            freqArr[s.charAt(i) - 'a']++;
        }
        for(int j=0; j<t.length(); j++){
            freqArr[t.charAt(j) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(freqArr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
