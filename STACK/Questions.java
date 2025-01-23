package STACK;

import java.util.Stack;

import PATTERNS.starPattern;

public class Questions {
    //Q1
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //kaam
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //Q2
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    //Q3
    public static void reverseStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        //kaam
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    //Q4 Stock span problem
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i + 1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    //Q6 Valid Parantheses
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            //closing
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && ch==')'
                || s.peek()=='[' && ch==']'
                || s.peek()=='{' && ch=='}'){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    //Q7 Dup Parantheses
    public static boolean isDup(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing case first check the closing char case
            if(ch==')'){
                int cnt = 0;
                while(s.peek() != '('){
                    s.pop();
                    cnt++;
                }
                if(cnt<1){
                    return true; //duplicate
                }else{
                    //pop the opening
                    s.pop();
                }
            }else{
                //opening case
                s.push(ch);
            }
        }
        return false;
    }

    //Q8 Max area in histogram
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        //Q1
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        //Q2
        // String str = "abcd";
        // System.out.println(reverseString(str));

        //Q3
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);
        // printStack(s);


        //Q4
        // int stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks,span);

        // for(int i=0; i<span.length; i++){
        //     System.out.println(span[i]+" ");
        // }

        //Q5 Next Greater Element
        // int arr[] = {6,8,0,1,3};
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr.length];
        
        // for(int i=arr.length - 1; i>=0; i--){
        //     //1 while
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        //         s.pop();
        //     }

        //     //2 if-else
        //     if(s.isEmpty()){
        //         nxtGreater[i] = -1;
        //     }else{
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     //3 push in s
        //     s.push(i);
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(nxtGreater[i]+" ");
        // }

        //Q6 Valid Paranthesis
        // String str = "({})[()][{}]{}"; //true
        // if(isValid(str))
        //     System.out.println("True");
        // else
        //     System.out.println("False");

        //Q7 Dup Parantheses
        // String str = "((a+b)+(c+d))";
        // System.out.println(isDup(str));

        //Q8 Max Area in Histogram
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
