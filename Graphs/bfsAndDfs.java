package Graphs;
import java.util.*;

import Recursion2.print;

public class bfsAndDfs {
    static class Edge{
            int src;
            int dest;
            // int wt;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            // this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2, 4));
    
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6,5));


    }
    public static void BFS(ArrayList<Edge> graph[], int V, boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        q.add(start); //starting point

        while( !q.isEmpty()){
            int curr = q.remove(); 
            if(vis[curr] == false){ 
                System.out.println(curr + " " ); //Step 1 : print the curr ele
                vis[curr] = true; //Step2: mark as visited

                for(int i=0; i<graph[curr].size(); i++){//Adjacency list traversal
                    Edge e = graph[curr].get(i); //(src,dest) -> Edge
                    q.add(e.dest); //Step 3: add all the neighbours of curr to the queue
                }


            }
        }

    }
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.println(curr + " "); //s1 : print node
        vis[curr] =true; //s2 : mark as visited

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
            DFS(graph, e.dest, vis); //s3 : call neighbours - e.dest refers to neighbour par jana 
        }
    }

    }
    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar){ //O(V^V)
        //base case
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){ //visited nhi hai
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + e.dest, tar); //path mai next node add kar
                vis[curr] = false; //backtrack aka vapis false kar taaki all possible paths traverse kar sake
            }
        }
    }
    public static void main(String[] args) { //O(V+E)
        int V = 7;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // boolean vis[] = new boolean[V]; //visited array to keep track of visited nodes
        // for(int i=0; i<V; i++){ 
        //     if(vis[i] == false){ //yeh baar baar starting point define karne ke liye hai incase of disconnected graph aka components alag alag ho
        //         BFS(graph, V, vis, i);
        //     }
        // }
        // for(int i=0; i<V; i++){
        //     if(vis[i] == false){
        //         DFS(graph,0,vis);
        //     }

        // }
        int src =0, tar = 5;
        printAllPath(graph, new boolean[V], src, "0", tar);
       
        System.out.println();

      
        
    }

    
}
