class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int n = s.length();

        int[] charArr = new int[26];

        for(int i=0; i<n; i++){
            charArr[s.charAt(i) - 'a']++;
            charArr[t.charAt(i) - 'a']--;
        }

        for(int j=0; j<26; j++){
            if(charArr[j] != 0){
                return false;
            }
        }

        return true;

    }
}
