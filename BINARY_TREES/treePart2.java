package BINARY_TREES;

public class treePart2 {
    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int idx;

        public static node buildTree(int n[]) {
            idx = -1;  //  Reset index before building a new tree
            return buildTreeHelper(n);
        }

        private static node buildTreeHelper(int n[]) {
            idx++;
            if (idx >= n.length || n[idx] == -1) {
                return null;
            }
            node newNode = new node(n[idx]);
            newNode.left = buildTreeHelper(n);
            newNode.right = buildTreeHelper(n);
            return newNode;
        }
    }

    public static class info {
        int diam, height;

        info(int d, int h) {
            this.diam = d;
            this.height = h;
        }
    }

    public static boolean isIdentical(node node, node subRoot) {
        if (node == null && subRoot == null) return true;
        if (node == null || subRoot == null || node.data != subRoot.data) return false;

        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubtree(node root, node subRoot) {
        if (subRoot == null) return true; // Fix: Empty subtree is always a valid subtree
        if (root == null) return false;

        if (isIdentical(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree tree = new binaryTree();
        node root = tree.buildTree(nodes);

        int n[] = {2, 4, -1, -1, 5, -1, -1};
        binaryTree subTree = new binaryTree();
        node subRoot = subTree.buildTree(n);

        System.out.println(isSubtree(root, subRoot)); // Should print `true`
    }
}
