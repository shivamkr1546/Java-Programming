package CP;
import java.util.*;
public class P1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p1 = w/2;
        if(p1+p1==w){
            if(p1%2==0){
                System.out.print("yes");
            }
        }else{
            System.out.print("no");
        }
    }
}
