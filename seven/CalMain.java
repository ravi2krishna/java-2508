package seven;

public class CalMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // wish 
        c.greetingMsg();

        // check number type
        String msg = c.numberType(-10);
        System.out.println(msg);

        // add numbers
        int result =  c.addNumbers(10, 30);
        System.out.println(result);

        // product of numbers
        double product = c.productNumbers(10, 15.5);
        System.out.println(product);
    }
}
