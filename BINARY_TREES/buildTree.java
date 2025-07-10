package BINARY_TREES;
import java.util.*;

public class buildTree { // O(n) complexity for tree construction
    // Node class representing each element of the binary tree
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        // Constructor to initialize a new node
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to manage tree operations
    static class BinaryTree {
        static int idx = -1; // Index to track node position in the array

        // Function to build the binary tree from an array representation (Preorder approach)
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) { // If value is -1, return null (represents no child)
                return null;
            }
            Node newNode = new Node(nodes[idx]); // Create new node
            newNode.left = buildTree(nodes); // Recursively build left subtree
            newNode.right = buildTree(nodes); // Recursively build right subtree
            return newNode;
        }
    }

    // Preorder Traversal (Root -> Left -> Right)
    public static void preorder(Node root) { // O(n)
        if (root == null) {
            System.out.print(-1 + " "); // Indicating null nodes
            return;
        }
        System.out.print(root.data + " "); // Print root
        preorder(root.left); // Traverse left subtree
        preorder(root.right); // Traverse right subtree
    }

    // Inorder Traversal (Left -> Root -> Right)
    public static void inorder(Node root) { // O(n)
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " "); // Print root after left subtree
        inorder(root.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public static void postorder(Node root) { // O(n)
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " "); // Print root after both subtrees
    }

    // Level Order Traversal (BFS)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Separator for levels

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // New line for each level
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null); // Add null marker for next level
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        //Level Order Traversal without using null markers
        public static void levelOrder(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int levelSize = q.size();

                for (int i = 0; i < levelSize; i++) {
                    Node currNode = q.remove();
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) q.add(currNode.left);
                    if (currNode.right != null) q.add(currNode.right);
                }

                // System.out.println(); // uncomment for level-wise printing
            }
        }

    }

    // Function to find the height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0; // Base case: height of null node is 0
        }
        int lh = height(root.left); // Height of left subtree
        int rh = height(root.right); // Height of right subtree
        return Math.max(lh, rh) + 1; // Max height of left & right + 1 (for root)
    }

    // Function to count the total number of nodes in the tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0; // Base case: No node contributes 0
        }
        int lc = countNodes(root.left); // Count nodes in left subtree
        int rc = countNodes(root.right); // Count nodes in right subtree
        return lc + rc + 1; // Total nodes including root
    }

    // Function to calculate sum of all nodes in the tree
    public static int sumNode(Node root) {
        if (root == null) {
            return 0; // Base case: sum of null node is 0
        }
        int leftSum = sumNode(root.left); // Sum of left subtree
        int rightSum = sumNode(root.right); // Sum of right subtree
        return leftSum + rightSum + root.data; // Total sum including root
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Input array for tree construction
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); // Build tree and get root

        // Uncomment the required traversal or function to execute
//        System.out.println(root.data); // Print root data
//        preorder(root); // Print preorder traversal
//        inorder(root); // Print inorder traversal
//        postorder(root); // Print postorder traversal
//        levelOrder(root); // Print level order traversal
//        System.out.print(height(root)); // Print height of tree
//        System.out.println(countNodes(root)); // Print number of nodes

        System.out.println(sumNode(root)); // Print sum of all nodes
    }
}
