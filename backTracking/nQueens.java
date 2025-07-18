package backTracking;
import java.util.*;

public class nQueens {
    public static void main(String[] args) {
        int n =4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){ //by default in every box we fill "X" and then check where we can place the queen
            for(int j=0; j<n; j++){
                board[i][j] ='.';
            }
        }
        nqueen(board, 0);
    }
    private static void nqueen(char[][] board, int row){
        int n= board.length;
        //base case
        if(row ==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        //work done and call
        for(int j =0; j<n; j++){ 
            if(isSafe(board, row, j)){ //traverse all col of a row to check for a safe box
                board[row][j] ='Q';
                nqueen(board, row+1); //move to the next row
                board[row][j] ='.'; //backtracking
            }
        }
        //agar kisi bhi row mai safe spot hai hi nhi toh phir dubara call lagegei hi nhi and this loop will not run i.e. no safe configuration case

    }


    private static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //Queen ko place karne ke liye saari directions mai safe hona chahiye
        //check row -> East & West
        for(int j=0; j<n; j++){
            if(board[row][j] =='Q') return false; 
        }
        //check col -> North & South
        for(int i=0; i<n; i++){
            if(board[i][col] =='Q') return false;
        }
        //check north east (Diagonals checked)
        int i=row;
        int j =col;
        while( i>=0 && j<n){ //har direction ke liye condn check hogi
            if(board[i][j] =='Q') return false;
            i--;
            j++;
        }
        //check south east
        i=row;
        j=col;
        while( i<n && j<n){
            if(board[i][j] =='Q') return false;
            i++;
            j++;
        }
        //check south west
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j] =='Q') return false;
            i++;
            j--;
        }
        //check north west
        i = row;
        j = col;
        while( i>=0 && j>=0){
            if(board[i][j] =='Q') return false;
            i--;
            j--;
        }
        return true;

        
        
    }
    
    
}
