package binaryTrees;

public class sizeMaxSumHeight {
    // static int size = 0;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    // public static void preorder(Node root){ //preorder traversal of ele - sasta method
    //     if(root == null) return;
    //     System.out.println(root.val + " ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE; //if we return 0, then it will not work for negative values
        // int a = root.val;
        // int b = max(root.left);
        // int c = max(root.right);
        // return Math.max( a , Math.max(b,c));
        return Math.max( root.val, Math.max( max(root.left), max(root.right)));
    } 
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min( root.val, Math.min(min(root.left),min( root.right)));
    }

    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int product(Node root){
        if(root == null) return 1; //multiplicative identity
        return root.val + product(root.left) + product(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(-2);
        Node b = new Node (3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left =c;
        a.right = d;
        Node e = new Node(-6);
        b.right = e;
        // preorder(root);
        System.out.println(size(root));;
        System.out.println(sum(root));
        System.out.println(max(root));

        
    }
    
}
