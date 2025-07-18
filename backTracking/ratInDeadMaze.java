package backTracking;

import Recursion2.print;

public class ratInDeadMaze {
    public static void main(String[] args) {
        int rows=4; 
        int cols=6;
        int[][] maze ={{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        print(0,0,rows-1, cols-1,"", maze);

    }
    private static void print(int sr,int sc, int er,int ec, String s, int[][] maze){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return; //agar entry blocked hai we can't enter maze
        //go right
        print(sr, sc+1, er, ec, s+"R", maze);
        //go down
        print(sr+1, sc,er,ec,s+"D",maze);

    }
    
}
