package eight;

public class ConstructorDemo {

    // explict constructor
    // public ConstructorDemo() {

    // }  
    
    // explict constructor with parameters
    public ConstructorDemo(int num) {
        
    }
    
    public static void main(String[] args) {
        
        // new -> allocate memory, create a space for obj
        ConstructorDemo obj = new ConstructorDemo(10);

        System.out.println("Implict Constructor Will be called");

    }
}
