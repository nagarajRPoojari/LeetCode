// https://leetcode.com/problems/valid-sudoku

class Solution {
    static boolean isValidCell(char[][] board,int row,int col){
        for(int i=0;i<9 ;i++){
            if(i!=row && board[i][col]==board[row][col]) return false;
            
            if(i!=col && board[row][i]==board[row][col]) return false;
        }
        int gridi=(row/3)*3;
        int gridj=(col/3)*3;
        for(int i=gridi;i<gridi+3;i++){
            for(int j=gridj;j<gridj+3;j++){
               if(i==row && j==col) continue;
               else if( board[i][j]==board[row][col]) return false;
            }
        }
        return true;    
    }
    public boolean isValidSudoku(char[][] board) {
        //check in column
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') continue;
                if(isValidCell(board,i,j)==false){ 
                    return false;
                }
            }
        }
        return true;
    }
}