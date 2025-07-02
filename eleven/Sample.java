package eleven;

import java.util.Random;

public class Sample {

    // static variable
    static int number;

    public static void main(String[] args) {
        
        Sample t1 = new Sample();
        t1.number = new Random().nextInt(); // Not Recommended 

        System.out.println(Sample.number); // Recommended 
        

        Sample t3 = new Sample();
        t3.number = new Random().nextInt();

        System.out.println(t1.number);
        System.out.println(t3.number);

    }
}
