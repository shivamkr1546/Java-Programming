package ARRAYLISTS;
import java.util.ArrayList;
public class ArrayListBasic {

    public static void main(String args[]){
    //  ClassName objectName = new ClassName();
        // ArrayList<Integer> list = new ArrayList<>();
        // // ArrayList<Boolean> list2 = new ArrayList<>();
        // // ArrayList<String> list3 = new ArrayList<>();

        // //Add Operation
        // list.add(1); //O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(1,9); //O(n)

        // //Get Operation - O(1)
        // // int element = list.get(2);
        // // System.out.println(element);

        // //Delete - O(n)
        // // list.remove(2);
        // // System.out.println(list);

        // //Set - O(n)
        // // list.set(2,10);
        // // System.out.println(list);

        // //Contains - O(n)
        // // System.out.println(list.contains(1));
        // // System.out.println(list.contains(11));

        // System.out.println(list.size());

        // //print the arraylist 
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // //print reverse arraylist
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // //Find max in an ArrayList - O(n)
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     // if(max<list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // //Multi-Dimensional ArrayList
        // ArrayList<ArrayList<Integer>> maniList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); list1.add(2);
        // maniList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // maniList.add(list2);

        // for(int i=0; i<maniList.size(); i++){
        //     ArrayList<Integer> currList = maniList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(maniList);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // nested loop to print mainList
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

    }
    
}
