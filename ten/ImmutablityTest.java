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

        // String Buffer
        StringBuffer sbf = new StringBuffer("Hello"); // -> new object is created
        sbf.append("world"); // same object is updated
        sbf.append("Java"); // same object is updated
        sbf.append("Program"); // same object is updated
        System.out.println(sbf);

        // String Builder
        StringBuilder sbd = new StringBuilder("Hello"); // -> new object is created
        sbd.append("world"); // same object is updated
        sbd.append("Java"); // same object is updated
        sbd.append("Program"); // same object is updated
        System.out.println(sbd);

    }
}
