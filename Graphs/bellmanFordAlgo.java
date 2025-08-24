package Graphs;
import java.util.*;

public class bellmanFordAlgo {
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));
    
        graph[3].add(new Edge(3, 4,4));

        graph[4].add(new Edge(4,1,-1));

    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V ){
        //initialization
        int dist[] = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int k=0; k<V-1; k++){ //O(V)
            //O(E)
            for(int i=0; i<V; i++){
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;
                    //Relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){ //Integer.MAX_VALUE aks infinity is used to avoid overflow kyunki java mai jab hum infinity mai aur bada number add kar dete hai toh voh negavtive ho jata hai /chota ho jata hai
                        dist[v] = dist[u] + e.wt;
                    }
                }   

            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.println(dist[i] +" ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V =5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);

    }
    
}
