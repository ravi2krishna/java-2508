package tweleve_inheritance;

import thirteen_encapsulation.TestPerson;

public class OtherPackageTest extends TestPerson {
    public static void main(String[] args) {
        OtherPackageTest tp = new OtherPackageTest();
        System.out.println("Inside Same Package - Different Class");
        System.out.println(tp.publicName);
        System.out.println(tp.protectedName);
        // System.out.println(tp.defaultName);
        // System.out.println(tp.privateName);
    }
}
