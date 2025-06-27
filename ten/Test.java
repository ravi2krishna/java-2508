package ten;

public class Test {
    public static void main(String[] args) {
        String name = "Ravi";
        String email = "ravi2krishna@gmail.com";

        System.out.println(name);
        System.out.println(email);

        System.out.println(name+email); // Concatenation

        int i = 10;

        // Test t1 = "Ravi"; Not allowed for any class excpet string
        String t1 = "Ravi";

        String str1 = "Hello"; // string literal
        String str2 = new String("Hello"); // new 
        
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        String str3 = "Hello"; // string literal    

        System.out.println(str1 == str3);

        System.out.println(str2 == str3);

        String str4 = "hello"; // string literal    
        System.out.println(str1 == str4); 
        
        String str5 = new String("Hello");

        System.out.println(str2 == str5);

        System.out.println(str2.equals(str5));
        System.out.println(str1.equals(str3));
        
        


    }
}
