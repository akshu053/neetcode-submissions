class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        int[] temp = new int[len];

        int j = 0;

        while(j<m){
            temp[j] = nums1[j];
            j++;
        }
        
        while(j<len){
            temp[j] = nums2[j-m];
            j++;
        }
        Arrays.sort(temp);
        for(int i=0; i<len; i++){
            nums1[i] = temp[i];
        }

    }
}