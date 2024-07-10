package OOPS;

public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object p1 
        // object are stored in heap memory
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;
    //setter
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    //getter
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

// 