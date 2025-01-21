package LINKEDLIST;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;

        if(size == 1){
            head = tail = null;
            size--;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Node temp = head;
        // Node pre = null;
        // while(temp.next != null){
        //     pre = temp;
        //     temp = temp.next;
        // }
        // int val = temp.data;
        // pre.next = null;
        // tail = pre;
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //reverse dll
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        dll.addLast(4);
        dll.print();
        System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);
        dll.reverse();
        dll.print();
    }
}
