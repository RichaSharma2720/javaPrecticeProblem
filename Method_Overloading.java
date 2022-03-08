package Array;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Method_Overloading {
    void show(String s, int b){ // sequence of argument
        System.out.println("1");
    }
    void show(int a){// types of argument
        System.out.println("2");
    }
    void show(int a, String S){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Method_Overloading y=new Method_Overloading();
        y.show("Richa",26);
        y.show(10);
        y.show(10,"Neha");

    }
}
