package BST;
import java.util.*;

public class traversals {
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
        String [] arr = {"10","5", "15","2", "8", "12", "17"};
        Node root= constructbfs(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);

    }
     public static void preorder(Node root){
        //pre-order : root left right
        if(root == null) return;
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){ //In BST , the inorder taraversal gives the sorted order
        //inorder : left root right
        if(root == null) return;        
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){
        //postorder : left root right
        if(root == null) return;        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }
}
