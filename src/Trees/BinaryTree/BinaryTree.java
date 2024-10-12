package Trees.BinaryTree;

import com.sun.jdi.connect.spi.TransportService;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {  // TC->O(n)
    // Node Creation
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Build Tree
    static class binaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        // TC->O(n) for all
        // Pre_Order Traversal
        public static void preOrder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        // In+Order Traversal
        public static void inOrder(Node root){
            if (root ==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if (root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        // Level Order Traversal
        public static void levelOrder(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data+" ");
                    if (currNode.left !=null){
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
    public static void KLevel(Node root,int level,int k){
        if (root ==null){
            return;
        }
        if (level == k){
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left,level+1,k);
        KLevel(root.right,level+1,k);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree  = new binaryTree();
        Node root = tree.buildTree(nodes);
     /*
      System.out.println(root.data);
      tree.preOrder(root);
      tree.inOrder(root);
      tree.postOrder(root);
      tree.levelOrder(root);
      */
        int k = 2;
        System.out.println("K level of Tree -> ");
        KLevel(root,1,k);


    }
}
