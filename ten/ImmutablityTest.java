package ten;

public class ImmutablityTest {
    public static void main(String[] args) {
        
        String str = "Hello";
        System.out.println(str.concat(" World"));
        System.out.println(str);

        String s = "hello";
        s = s.concat("world"); // every change we made -> new object is created
        s = s.concat("Java"); //  new object is created
        s = s.concat("Program"); // new object is created

    }
}
