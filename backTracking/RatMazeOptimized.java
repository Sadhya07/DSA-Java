package backTracking;

public class RatMazeOptimized {
    public static void main(String[] args) {
        int rows=3; 
        int cols=4;
        int[][] maze ={{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1},
                        };
        print(0,0,rows-1, cols-1,"", maze);

    }
    private static void print(int sr,int sc, int er,int ec, String s, int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return; //Blocked
        if(maze[sr][sc]== -1) return; //Visited

        //check - maze mai hi traverse kiye hue ko -1 bana do as marker
        maze[sr][sc] = -1;

        //go right 
        print(sr,sc+1,er,ec,s+"R",maze); 
        //go down 
        print(sr+1,sc,er,ec,s+"D", maze);
        //go left
        print(sr, sc-1,er, ec, s+"L",maze);
        //go up
        print(sr-1,sc,er,ec,s+"U",maze);

        //backtracking
        maze[sr][sc] = 1; //uncheck by changing -1 to 1 again
    }

    
}
