class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        char res[] = new char[123];
        
        if(s.length() != t.length())   
            return false;

        for(int i=0; i<s1.length; i++){
            res[s1[i]]++;
        }
        for(int j=0; j<t1.length; j++){
            res[t1[j]]--;
        }
        for(int i=97; i<123; i++){
            if(res[i]!=0){
                return false;
            }
        }

        return true;
    }
}
