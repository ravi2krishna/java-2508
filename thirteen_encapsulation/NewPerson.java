package thirteen_encapsulation;

public class NewPerson {
    public static void main(String[] args) {
        TestPerson tp = new TestPerson();
        System.out.println("Inside Same Package - Different Class");
        System.out.println(tp.publicName);
        System.out.println(tp.protectedName);
        System.out.println(tp.defaultName);
        // System.out.println(tp.privateName); // We cannot access private from other classes
    }
}
