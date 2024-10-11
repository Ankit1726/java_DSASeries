package Trees.BinaryTree;

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

    }
}
