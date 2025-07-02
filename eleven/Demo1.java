package eleven;

public class Demo1 {

    // static block
    static {
        // all my configurations 
        final String institute = "Edify";
        System.out.println("Static Block Executed");
    }

    // non-static block
    {
       System.out.println("Non-Static Block Executed"); 
    }

    // Constructor    
    public Demo1(){
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed");
        Demo1 d = new Demo1();
    }
}