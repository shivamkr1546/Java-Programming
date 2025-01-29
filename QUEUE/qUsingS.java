package QUEUE;

import java.util.Stack;

public class qUsingS {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //Push O(n)
        // public static boolean isEmpty(){
        //     return s1.isEmpty();
        // }

        // public static void add(int data){
        //     while(!s1.isEmpty()){
        //         s2.push(s1.pop());
        //     }

        //     s1.push(data);
        //     while(!s2.isEmpty()){
        //         s1.push(s2.pop());
        //     }
        // }

        // public static int remove(){
        //     if(isEmpty()){
        //         System.out.println("Queue Empty");
        //         return -1;
        //     }

        //     return s1.pop();
        // }

        // public static int peek(){
        //     if(isEmpty()){
        //         System.out.println("Queue Empty");
        //         return -1;
        //     }

        //     return s1.peek();
        // }

        //Pop O(n)
        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            if(s2.isEmpty()){
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        public static int top(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            if(s2.isEmpty()){
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();

        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.top());
            q.remove();
        }
    }
}
