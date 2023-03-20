// https://leetcode.com/problems/sudoku-solver

class Solution {
    static boolean helper(char[][] board,int row,int col){
        if(row==9)
            return true;
        int nRow,nCol;
        if(col!=8){
            nRow=row;
            nCol=col+1;
        }
        else{
            nRow=row+1;
            nCol=0;
        }
        if(board[row][col]!='.'){
            if(helper(board,nRow,nCol))
                return true;
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,(char)(i+'0'))){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,nRow,nCol))
                        return true;
                    else
                        board[row][col]='.';
                }    
            }
        }
        return false;

        
    }
    static boolean isSafe(char[][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==num)
                return false;
            if(i!=col && board[row][i]==num)
                return false;

        }
        int gridi=(row/3)*3;
        int gridj=(col/3)*3;
        for(int i=gridi;i<gridi+3;i++){
            for(int j=gridj;j<gridj+3;j++){
                if(i==row && j==col) continue;
                if(board[i][j]==num)
                    return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        boolean x=helper(board,0,0);
    }
}