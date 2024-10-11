package Trees.BinaryTree;

public class Finding_Diameter {
        // Class to store the diameter and height together
        public static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        // Method to calculate the diameter of the tree
        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0); // Base case: diameter and height of null node are both 0
            }

            Info leftInfo = diameter(root.left);    // Recursive call on the left subtree
            Info rightInfo = diameter(root.right);  // Recursive call on the right subtree

            // Calculate diameter
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

            // Calculate height
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht); // Return both diameter and height
        }

        // Define the Node class
        public static class Node {
            int data;
            Node left, right;

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public static void main(String[] args) {
        /*
              1
            /   \
           2     3
          / \   / \
         4   5 6   7
        */

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            Info result = diameter(root);
            System.out.println("Diameter of the tree: " + result.diam);
        }
    }


