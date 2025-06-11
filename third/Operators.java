package third;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Ops
        int num1 = 10;
        int num2 = 5;

        // Maths Cal
        // Addition + 
        System.out.println("Sum is: "+(num1+num2));

        // Sub + 
        System.out.println("Diff is: "+(num2-num1));

        // Product * 
        System.out.println("Product is: "+(num1*num2));
        
        // Division / 
        System.out.println("Divi is: "+(num1/num2));

        // Modulus %
        System.out.println("Mod is: "+(num1%num2));

        // Increment - Decrement
        int a = 10;
        System.out.println("Original A Value: "+a);
        System.out.println("++A Value: "+ ++a); // pre
        System.out.println("A++ Value: "+ a++); // post
        System.out.println("Updated A Value: "+a);

        // Try Out with - Decrement

        // Assignment Ops
        int num = 10;
        num+= 10; // num = num + 10
        num+= 2; // incrment by 2 points
        num+= 5; // incrment by 5 points --> custom indexs
        System.out.println("Addition Assignment: " +num);

        // Comparision (boolean -> true/false)
        int x = 7;
        int y = 5;
        int b = 14;
        int c = 9;
        boolean isGreater = x > y;
        System.out.println("Is Greater: "+isGreater);

        boolean isequal = x == y;
        System.out.println("Is Equal: "+isequal);

        // Logical Ops (boolean -> true/false)
        boolean resultAND = x > y && b<c; // T && F -> F
        System.out.println("Logical AND: "+resultAND);

        boolean resultNOT = x > y; // T -> F
        System.out.println("Logical NOT: "+ !resultNOT);

    }
}
