package backTracking;

public class maxKnightsInBoard {
    static int maxknights =-1;
    static int number =3;
    public static void main(String[] args) {
    
     int n =4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){ //by default in every box we fill "X" and then check where we can place the queen
            for(int j=0; j<n; j++){
                board[i][j] ='X';
            }
        }

        nKnight(board, 1, 0,1);
        System.out.println(maxknights);        
    }
    private static boolean isSafe(char[][] board, int row, int col){
        int n= board.length;
        int i,j;

        //2 Up 1 right
        i = row -2;
        j = col +1;
        if(i>=0 && j<n && board[i][j] =='K') return false;
         //2 Up 1 left
        i = row -2;
        j = col -1;
        if(i>=0 && j>=0 && board[i][j] =='K') return false;
        //2 Down 1 right
        i = row +2;
        j = col +1;
        if(i<n && j<n && board[i][j] =='K') return false;
        //2 Down 1 left
        i = row +2;
        j = col -1;
        if(i<n && j>=0 && board[i][j] =='K') return false;
        //2 Right 1 Up
        i =row-1;
        j = col+2;
        if(i>=0 && j<n && board[i][j] =='K') return false;
        //2 Right 1 Down
        i =row+1;
        j = col+2;
        if(i<n && j<n && board[i][j] =='K') return false;
        //2 Left 1 Up
        i =row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j] =='K') return false;
        //2 Left 1 Down
        i =row +1;
        j = col-2;
        if(i<n && j>=0 && board[i][j] =='K') return false;
        return true;
    }

    private static void nKnight(char[][] board, int row, int col, int num){
        int n = board.length;
       
        if(row ==n){ //base case
            if(num  == number){
            for(int i=0; i<n; i++){
                for(int j=0;j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
            }
            maxknights = Math.max(maxknights, num);
            return;

        }

    // // ✅ Move to next row if column goes out of bound
    // if (col == n) {
    //     nKnight(board, row + 1, 0, num);
    //     return;
    // }

    // // ✅ Try placing knight
    // if (isSafe(board, row, col)) {
    //     board[row][col] = 'K';
    //     nKnight(board, row, col + 1, num + 1);
    //     board[row][col] = 'X'; // backtrack
    // }

    // // ✅ Try without placing knight
    // nKnight(board, row, col + 1, num);


        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col!=n-1) {
                nKnight(board, row, col +1, num +1);//unlike nQueens we check every columns as well coz there may be multiple knights in  a row
            }
            else {
            nKnight(board, row+1, col, num+1); //move to next row when reached last col
            board[row][col] = 'X'; //backtracking
            }
        }

      

        if(col!= n-1) nKnight(board, row, col+1, num); //as knight is not placed we dont increment num and check till last col
        else nKnight(board, row+1, 0, num);
        
    
    }

    

}

