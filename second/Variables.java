package second;

public class Variables {

    static int numb; // static variable -> we can use static varibles without Initialization
    int num; // instance variable -> we can use varibles without Initialization in non-static methods

    // non-static method
    public void displayNumber(){ 
        System.out.println(num);
    }

    public static void main(String[] args) {
        int number; // local variable -> variable defined inside a method -> must be Initialized
        System.out.println(numb);
        // System.out.println(num);
        // System.out.println(number);
    }
}
