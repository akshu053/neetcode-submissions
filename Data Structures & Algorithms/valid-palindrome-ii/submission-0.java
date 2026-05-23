class Solution {
    public boolean validPalindrome(String s) {
        String str1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charArr = str1.toCharArray();

        int start = 0;
        int end = charArr.length - 1;

        while(start<end){
            if(charArr[start] != charArr[end]){
                return checkPalindrome(start + 1, end, charArr) || checkPalindrome(start, end - 1, charArr);
            }

            start++;
            end--;
        }
        return true;
    }

    private boolean checkPalindrome(int i, int j, char[] arr){
        while(i<j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}