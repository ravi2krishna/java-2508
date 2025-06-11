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

        // Bitwise ops 
        int a1 = 5; // 0101
        int b1 = 3; // 0011
                    
        int r1 = a1 & b1 ;  // 0001
        System.out.println("Bitwise AND "+r1);

        int r2 = a1 | b1 ; // 0111
        System.out.println("Bitwise OR "+r2);

        int r3 = a1 ^ b1 ; // 0110
        System.out.println("Bitwise OR "+r3);

        int r4 = ~ a1 ; // 1010
        System.out.println("Bitwise OR "+r4);

        // 3 -> 0000000000000011
        // 3<<2 --> 0000000000001100 == 0000000000001100
        // 3<<1 --> 0000000000000110 == 0000000000000110
        // 3<<3 --> 0000000000011000 == 0000000000011000
        // Left Shift -> Add those many zeros filling left side
        System.out.println(3<<2);
        System.out.println(3<<1);
        System.out.println(3<<3);

        // 3>>2 --> 0000000000000000 == 0000000000000000
        // 3>>1 --> 0000000000000001 == 0000000000000001
        // 3>>3 --> 0000000000000000  == 0000000000000000 
        System.out.println(3>>2);
        System.out.println(3>>1);
        System.out.println(3>>3);

    }
}
