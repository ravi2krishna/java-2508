package eleven;

import java.util.Random;

public class Test {

    // instance or non-static variable
    int number;

    public static void main(String[] args) {
        
        Test t1 = new Test();
        t1.number = new Random().nextInt();

        Test t2 = new Test();
        t2.number = new Random().nextInt();

        Test t3 = new Test();
        t3.number = new Random().nextInt();

        System.out.println(t1.number);
        System.out.println(t2.number);
        System.out.println(t3.number);

    }
}
