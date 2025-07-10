package BST;
import java.util.*;
public class bstpart1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    //Searching in a BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Deleting a node
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //case 3 - both children
            //first find inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //Print in Range
     public static void printInRange(Node root, int k1, int k2){
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
     }

     //Root to leaf path
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    //Validate BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    //Mirror BST
    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorBST(root.left);
        mirrorBST(root.right);

        return root;
    }

    public static void main(String[] args){
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }

//        inorder(root);

//        if(search(root, 1)){
//            System.out.println("Found");
//        }else{
//            System.out.println("Not Found");
//        }

//        root = delete(root, 5);
//        inorder(root);

//        printRoot2Leaf(root, new ArrayList<>());

//        if(isValidBST(root, null, null)){
//            System.out.println("Valid");
//        }else{
//            System.out.println("Not Valid");
//        }

        root = mirrorBST(root);
        inorder(root);

    }
}
