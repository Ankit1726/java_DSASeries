package Trees.BinaryTree;

import java.util.ArrayList;

public class finding_Height {
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node rooot){
        if (rooot == null){
            return 0;
        }
        int lh = height(rooot.left);
        int rh = height(rooot.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }
    public static int Sum(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum+rightSum+ root.data;
    }

    public static int diameter(Node root){
        if (root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int tightDiam = diameter(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt+rightHt+1;

        return Math.max(selfDiam,Math.max(leftDiam,tightDiam));
    }
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if (node == null && subRoot == null){
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left , subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }

        }
        return  isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public static boolean getPath(Node root,int n, ArrayList<Node> path){
        if (root == null){
            return false;
        }
        path.add(root);
        if (root.data == n){
            return true;
        }
         boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);
        if (foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root,int n1,int n2){  // TC->O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        // last common ancestor
        int i=0;
        for (;i<path1.size() &&i< path2.size();i++){
            if (path1.get(i)!=path2.get(i)){
                break;
            }
        }
        // last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root,int n1,int n2){
        if (root == null){
            return root;
        }
        if (root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

        // leftLca = val rightLca = null
        if (rightLca == null){
            return leftLca;
        }
        if (leftLca == null){
            return rightLca;
        }
        return root;
    }
    // minimum distance between nodes
    public static int lcaDist(Node root, int n){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right,n);

        if (leftDist == -1 && rightDist == -1){
            return -1;
        }else if (leftDist == -1){
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }
    public static int minDis(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);
        int dis1 = lcaDist(lca,n1);
        int dis2 = lcaDist(lca,n2);

        return dis1+dis2;
    }
    // Kth Ancestor
    public static int KAncestor(Node root,int n,int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftDist = KAncestor(root.left,n,k);
        int rightDist =KAncestor(root.right,n,k);

        if (leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist,rightDist);
        if (max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    // TransForm toSubtree
    public static int  transForm(Node root){
        if (root==null){
            return 0;
        }
        int leftChild = transForm(root.left);
        int rightChild = transForm(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
         root.data  =  newLeft+leftChild + newRight+rightChild;
        return data;
    }
    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {

         /*
                   1
                 /  \
                2    3
               / \  / \
              4  5  6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of tree is -> "+height(root));
        System.out.println("Count of tree is -> "+count(root));
        System.out.println("Sum of Tree is -> "+Sum(root));
        System.out.println("Diameter of tree is -> "+diameter(root));
        // Subtree

        /*
             2
            / \
           4   5

         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Subtree is -> "+isSubtree(root,subRoot));
        System.out.println("Lowest Common Ancestor -> "+lca(root,4,5).data);
        System.out.println("Lowest Common Ancestor -> "+lca2(root,4,7).data);
        System.out.println("Minimum distance between two nodes is -> "+minDis(root,4,6));
        System.out.println("Kth Ancestor -> "+KAncestor(root,5,2));
        System.out.println("Transformation of tree is...");
        transForm(root);
        preOrder(root);


    }
}
