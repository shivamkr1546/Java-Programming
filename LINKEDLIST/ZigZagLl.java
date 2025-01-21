package LINKEDLIST;
import java.util.*;
public class ZigZagLl {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add First
    public void addFirst(int data){
        //step 1
        Node newNode = new Node(data);
        //step 2
        newNode.next = head;
        //step 3
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
    }

    //add last
    public void addLast(int data){
        //step 1
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        tail.next = newNode;
        //step 3
        tail = newNode;
    }

    //print ll
    public void printLl(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public void ZigZagLl(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        Node next;

        mid.next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alt merge - zig-zag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
        }
    }
    public static void main(String args[]){
        ZigZagLl ll = new ZigZagLl(); //creation of linked list 
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.ZigZagLl();
        ll.printLl();
    }
}
