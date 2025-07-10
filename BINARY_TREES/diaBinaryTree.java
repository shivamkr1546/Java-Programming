package BINARY_TREES;

public class diaBinaryTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    //Diameter of Binary Tree
    public static int diaOfBT(Node root){
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    public static int dfs(Node root, int[] res){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int dia = diaOfBT(root);
        System.out.print(dia);
    }
}
