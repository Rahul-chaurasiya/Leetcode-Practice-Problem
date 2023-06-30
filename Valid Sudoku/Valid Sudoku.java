class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet hc = new HashSet();
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch != '.' && hc.contains(ch)) return false;
                hc.add(ch);                
            }

            HashSet hr = new HashSet();
            for(int j=0;j<9;j++){
                char ch = board[j][i];
                if(ch != '.' && hr.contains(ch)) return false;
                hr.add(ch);                
            }
        }

        for (int block = 0; block < 9; block++) {
            HashSet<Character> seen = new HashSet<>();
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;

            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    char currentVal = board[i][j];
                    if (currentVal != '.') {
                        if (!seen.add(currentVal))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
