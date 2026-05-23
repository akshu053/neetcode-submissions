class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; //3
        int cols = matrix[0].length; //4

        // [1, 2, 4, 8, 10, 11, 12, 13, 14, 20 ,30, 40]

        int low = 0;
        int high = (rows*cols)-1;

        while(low<=high){
            int mid = low + (high-low)/2; //mid = 5

            int row = mid/cols; 
            int col = mid%cols;   

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return false;
    }
}
