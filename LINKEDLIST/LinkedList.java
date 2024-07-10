package LINKEDLIST;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){   //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //O(1)
    public void addFirst(int data){

        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }
    //O(1)
    public void addLast(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 
        tail.next = newNode;

        //step3
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //Print LinkedList TC-O(n)
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    //remove in a linked list
    public int removeFirst(){
        //special case
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //previous node i = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Search(Iterative)
    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //reverse a linked list  //O(N)
    public void reverse(){  
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //Find & Remove Nth node from End
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; //remove head
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Palindrom in linked list
    //slow - fast approach
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next==null){
            return true;
        }

        //step1 - find mid
        Node midNode = findMiddle(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        //ll.head = new Node(1);
        // Operations in Linked List are done by making Methods
        //add(),remove(),print(),search()
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addMiddle(2, 3);
        ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        
        System.out.println(ll.checkPalindrome());

    }
}
