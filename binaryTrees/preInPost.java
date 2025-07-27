package binaryTrees;

public class preInPost {
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
    public static void preorder(Node root){
        //pre-order : root left right
        if(root == null) return;
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
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
    public static void nthLevel(Node root, int n){
        if(root == null) return;
        if(n==1) System.out.print(root.val);
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node (3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left =c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node (7);
        b.left= e;
        b.right = f;
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // nthLevel(root,1);
        int level = height(root) +1;
        for(int i=1; i<=level; i++){
            nthLevel(root, i);
            System.out.println();
        }

 
        
    }

    
}
