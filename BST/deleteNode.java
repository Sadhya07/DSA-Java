package BST;
import java.util.*;

public class deleteNode {
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
        String [] a = {"50","20", "60","17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root= constructbfs(a);
        // preorder(root);
        // System.out.println();
        // delete(root, 34);
        // preorder(root);
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int val = 60;
        int idx = -1;
        for(int i=0; i< arr.size(); i++){
            if(arr.get(i) ==val){
                idx = i;
                break;
            }
        }
        int pred = arr.get(idx-1);
        int succ = arr.get(idx+1);
        System.out.println("Predecessor is :" + pred);
        System.out.println("Sucessor is: " + succ);;



    }
    public static void delete(Node root, int target){
        if(root == null) return;
        if(root.val > target){ //go left
            if(root.left == null) return; //if left is null, then target not found
            if(root.left.val == target) {
                Node l = root.left;
                if(l.left == null && l.right == null) root.left = null; //if roo.left is a leaf node then directly delete it 
                else if(l.left == null || l.right == null){ //1 child
                    if(l.left != null) root.left = l.left;
                    else root.left = l.right;
                }else{ //2 child
                    Node curr =l;

                }

            }
            else delete(root.left, target);
        }else{ //go right
            if(root.right ==null) return; // if right is null, root not found               
            if(root.right.val == target){
                Node r = root.right;
                if(r.left == null && r.right == null) root.right = null; //if roo.left is a leaf node then directly delete it 
                else if(r.left == null || r.right == null){ //1 child
                    if(r.left != null) root.right = r.left;
                    else root.right = r.right;
                }
            }
            else delete(root.right, target);
        }
    
    }
     public static void preorder(Node root){
        //pre-order : root left right
        if(root == null) return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void inorder(Node root, List<Integer> arr){
        //pre-order : root left right
        if(root == null) return;
        
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }


    
}
