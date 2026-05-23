class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Map<Integer, Set<Character>> boxMap = new HashMap<>();

        Set<Character>[] colSet = new HashSet[cols]; //Array of sets for each col
        for(int i=0; i<cols; i++){
            colSet[i] = new HashSet<>();
        }

        for(int i=0; i<rows; i++){
            Set<Character> rowSet = new HashSet<>();
            for(int j=0; j<cols; j++){
                char val = board[i][j];

                if(val == '.'){
                    continue;
                }

                if(!colSet[j].add(board[i][j]) || !rowSet.add(board[i][j]) ){
                    return false;
                }

                //for boxMap
                int row = i/3;
                int col = j/3;

                int boxIndex = row*3 + col;

                boxMap.putIfAbsent(boxIndex, new HashSet<>());
                if(!(boxMap.get(boxIndex).add(board[i][j]))){
                    return false;
                }
            }
        }

        return true;        

    }
}
