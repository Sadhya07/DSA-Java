package BST;
import java.util.*;

public class predSucc {
    //declare global variables 
    static int pred= -1;
    static int succ =-1;
    static Node temp = null;
    static boolean flag = false;

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root == null || root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void nthLevel(Node root, int n){
        if(root == null) return;
        if(n==1){
            System.out.print(root.val + " ");
            return;
        } 
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static Node constructbfs(String[] arr){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]); //root value : the pasreInt method converts a string into Integer
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i =1;
        while( i < n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2; //increment by 2 as we are adding two children at a time
        }
        return root;

    }
   
  
    public static void main(String[] args) {
        String [] a = {"50","30", "70","20", "40", "60", "80"};
        Node root= constructbfs(a);
        int val =30;
        inorder(root, val);
        System.out.println(pred);
        System.out.println(succ);


    }

     public static void preorder(Node root){
        //pre-order : root left right
        if(root == null) return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void inorder(Node root, int val){
        //pre-order : root left right
        if(root == null) return;
        
        inorder(root.left, val);
        //some work - magic happens
        if(temp == null) temp = root;
        else{
            if(root.val == val){
                pred = temp.val; //pred ki value mil jayegi
                flag = true;

            }else if( root.val > val && flag == false){ //jab pehli baar root ki value key value se badi hai yani voh succesor hai
                succ = root.val;
                flag = true;
            }
            else{
                temp = root; //agar key value nhi mill toh keep changing value of temp-
            }
        }

        inorder(root.right, val);
    }


    

    
}
