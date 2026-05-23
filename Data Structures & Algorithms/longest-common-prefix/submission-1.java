class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        String prefix = strs[0];

        for(int j=1; j<strs.length; j++){
            while(strs[j].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;




    }
}