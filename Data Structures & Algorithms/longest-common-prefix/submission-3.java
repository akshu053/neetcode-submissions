class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null){
            return "";
        }

        String prefix = strs[0];

        for(int i=0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}