package info.company.Lec15;

import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {
        int grid[][] = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

//        3 1 6 5 7 8 4 9 2
//        5 2 9 1 3 4 7 6 8
//        4 8 7 6 2 9 5 3 1
//        2 6 3 4 1 5 9 8 7
//        9 7 4 8 6 3 1 2 5
//        8 5 1 7 9 2 6 4 3
//        1 3 8 9 4 7 2 5 6
//        6 9 2 3 5 1 8 7 4
//        7 4 5 2 8 6 3 1 9

        sudokusolver(grid,0,0);
    }

    public static void sudokusolver(int[][] board, int row ,int col){

        if(row==board.length){

            display(board);
            return;
        }

        if(col == board.length){
            sudokusolver(board,row+1,0);
            return;
        }

        if(board[row][col]==0){

            for (int val = 1; val <=9 ; val++) {

                if(isSafe(board,row,col,val)){

                    board[row][col]= val;
                    sudokusolver(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }

        else{
            sudokusolver(board,row,col+1);
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int val) {

        for (int i = 0; i <board.length ; i++) {

            if(board[i][col]==val){
                return false;
            }
        }

        for (int i = 0; i <board.length ; i++) {

            if(board[row][i]==val){
                return false;
            }
        }

        int rno = row/3;
        int cno = col/3;

        for (int i = 3*rno; i <3*(rno+1) ; i++) {
            for (int j = 3*cno; j <3*(cno+1) ; j++) {

                if(board[i][j]==val){
                    return false;
                }
            }
        }

        return true;
    }

    private static void display(int[][] board) {

        for (int i = 0; i <board.length ; i++) {

            System.out.println(Arrays.toString(board[i]));
        }
    }
}
