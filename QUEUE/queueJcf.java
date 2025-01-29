package QUEUE;
import java.util.*;
public class queueJcf {
    public static void main(String args[]){
        //Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>(); // queue is interface in jcf so we use linkedlist
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
