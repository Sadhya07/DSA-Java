package Graphs;

import java.util.ArrayList;

public class CycleUndirected {
     static class Edge{
            int src;
            int dest;
            
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
          
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
   

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 0));
       
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 0));

        graph[3].add(new Edge(3, 0));





    }

    
}
