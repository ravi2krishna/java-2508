package fifth;

public class ForDemo {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            System.out.println("Hi");
        }

        // fill 5 water bottles
        for(int i=1;i<=5;i++) {
            System.out.println("Filling Water Bottle: "+i);

            // fill only upto 2 bottles, we got only few people
            if (i==2) {
                break;
            }
        }
    }
}
