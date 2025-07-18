package backTracking;

public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols =3;
        boolean[][] isVisited= new boolean[rows][cols]; //by default -> false 
        print(0,0,rows-1,cols-1,"", isVisited); //start from 0 as it is a 2D arr
        
    }
    private static void print(int sr, int sc, int er, int ec, String s, boolean[][]isVisited){
        if(sr<0 || sc<0) return; //agar left jate hue 1 se kam nhi aur upar jate hue bhi 1rst columns se upar nhi
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc] ==true) return; //V imp- prevents returning to a block rat has visited before i.e prevents infinte loop

        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true; //check

        //go right 
        print(sr,sc+1,er,ec,s+"R",isVisited); //so string of whole path get printed - s+"R"
        //go down 
        print(sr+1,sc,er,ec,s+"D", isVisited);
        //go left
        print(sr, sc-1,er, ec, s+"L", isVisited);
        //go up
        print(sr-1,sc,er,ec,s+"U", isVisited);

        //backtracking
        isVisited[sr][sc] =false; //uncheck
    
    
    }
    
}
