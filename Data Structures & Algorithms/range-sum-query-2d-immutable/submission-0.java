class NumMatrix {

    int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        prefixSum = new int[rows+1][cols+1];
        for(int row=0; row<rows; row++){
            int prefix = 0;
            for(int col=0; col<cols; col++){
                prefix += matrix[row][col];
                int above = prefixSum[row][col+1];
                prefixSum[row+1][col+1] = prefix + above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = prefixSum[row2][col2]; //whole matrix sum from 0,0
        int above = prefixSum[row1-1][col2];
        int left = prefixSum[row2][col1-1];
        int topLeft = prefixSum[row1-1][col1-1];
        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */