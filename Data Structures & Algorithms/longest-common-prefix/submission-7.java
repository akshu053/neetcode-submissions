class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String prefix = strs[0];

        for(int j = 0; j<prefix.length(); j++){
            char ch = prefix.charAt(j);
            for(int i=1; i<strs.length; i++){
                if(j>=strs[i].length() || ch != strs[i].charAt(j)){
                    res = prefix.substring(0, j);
                    return res;
                }
            }
        }

        return prefix;
    }
}