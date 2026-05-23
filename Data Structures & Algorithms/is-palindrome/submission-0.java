//two pointer
//take two pointers

class Solution {
    public boolean isPalindrome(String s) {
        String alphaNumeric = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();       
        int i, j;
        i = 0;
        j = alphaNumeric.length() - 1;
        while(i<j){
            if(alphaNumeric.charAt(i) != alphaNumeric.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
