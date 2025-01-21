package LINKEDLIST;

public class CircularLL {

    private Node last;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add to empty
    public void addToEmpty(int data) {
        if (last != null) {
            return;
        }
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
    }

    // addFirst
    public void addFirst(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
    }

    // addLast
    public void addLast(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    // add Middle
    public void addAfter(int data, int item) {
        if (last == null) {
            return;
        }
        Node newNode = new Node(data);
        Node temp = last.next;
        do {
            if (temp.data == item) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (temp == last)
                    last = newNode;
            }
            temp = temp.next;
        } while (temp != last.next);
    }

    // delete node
    public void deleteNode(int key) {
        if (last == null) {
            return; // List is empty
        }
    
        Node temp = last;
        // Case 1: If the list contains only one node and that node matches the key
        if (last.data == key && last.next == last) {
            last = null; // Remove the only node
            return;
        }
    
        // Case 2: If the node to be deleted is the first node
        if (last.next.data == key) {
            last.next = last.next.next; // Update last's next to skip the first node
            return;
        }
    
        // Case 3: Search for the node to delete
        while (temp.next != last) {
            if (temp.next.data == key) {
                temp.next = temp.next.next; // Remove the node by skipping it
                return;
            }
            temp = temp.next;
        }
    
        // Case 4: If the node to delete is the last node
        if (last.data == key) {
            temp.next = last.next; // Update the second last node's next
            last = temp; // Update last to the new last node
        }
    }
    

    // print cll
    public void print() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node p = last.next;
        do {
            System.out.print(p.data + "->");
            p = p.next;
        } while (p != last.next);
        System.out.println("(Back to start)");
    }

    public static void main(String args[]) {
        CircularLL cll = new CircularLL();
        cll.addToEmpty(6);
        cll.addFirst(5);
        cll.addLast(7);
        cll.addAfter(4, 7);
        cll.deleteNode(4);
        cll.print();
    }
}
