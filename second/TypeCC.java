package second;

public class TypeCC {
    public static void main(String[] args) {
        // Type Conversion -> possible
        int num = 10; // 4 bytes
        double number = num; // 8 bytes
        System.out.println("After Type Conversion");
        System.out.println("Original Value: "+num);
        System.out.println("Converted Value: "+number);

        // Type Casting -> possible
        double value = 3.14; // 8 bytes
        int newValue = (int) value; // 4 bytes

        System.out.println("After Type Casting");
        System.out.println("Original Value: "+value);
        System.out.println("Converted Value: "+newValue);

        // Conversion Not Possible Directly
        int data = 100;
        // String newData = (String) data; // Error
        String newData = String.valueOf(data);
        System.out.println("Original Value: "+data);
        System.out.println("Converted Value: "+newData);

       System.out.println(data+100); // arithmetic operation     
       System.out.println(newData+100); // string concatenation

       // Conversion Not Possible At All
       int testNumber =  10;
       // boolean isCorrect = (boolean) testNumber; // true / false


    }
}
