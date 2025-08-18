package Graphs;
import java.util.*;

    public class introToGraph {
        static class Edge{
            int src;
            int dest;
            int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2, -1));




    }
    public static void main(String[] args) {
        int V = 4;
        //We make an array of ArrayLists which contain edges for each vertex
        //isme jaise hum int[] arr define karte hai represnting ki hum integer values store kar rahe hai similarly hum ArrayList<Edge> graph[] likhte hai showing ki hum arraylist store kar rahe hai of edges of graph
        //0th index mai vertex 0 ke edges store honge, 1rst edx mai 1rst vertex ke edges store honge and so on 
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //print neighburs - jitne neighbiurs honge utne hi edges honge
        for(int i=0; i<graph[2].size(); i++){ //prints 2 ke neighbours
            Edge e = graph[2].get(i);
            System.out.println(e.dest + "," + e.wt);
        }
        
    }
    
}
