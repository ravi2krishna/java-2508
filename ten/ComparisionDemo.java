package ten;

public class ComparisionDemo {
    public static void main(String[] args) {
       
        // 1. Using String (Immutable)
       long startTimeString = System.currentTimeMillis();
       String str = "Java";
       for (int i = 0; i < 10000; i++) {
           str = str.concat(" Programming");
       }
       long endTimeString = System.currentTimeMillis();
       System.out.println("Time taken using Strings: " + (endTimeString - startTimeString) + " ms");


       // 2. Using StringBuilder (Mutable, not thread-safe)
       long startTimeBuilder = System.currentTimeMillis();
       StringBuilder sb = new StringBuilder("Java");
       for (int i = 0; i < 100000; i++) {
           sb.append(" Programming");
       }
       long endTimeBuilder = System.currentTimeMillis();
       System.out.println("Time taken using StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " ms");


       // 3. Using StringBuffer (Mutable, thread-safe)
       long startTimeBuffer = System.currentTimeMillis();
       StringBuffer sf = new StringBuffer("Java");
       for (int i = 0; i < 10000; i++) {
           sf.append(" Programming");
       }
       long endTimeBuffer = System.currentTimeMillis();
       System.out.println("Time taken using StringBuffer : " + (endTimeBuffer - startTimeBuffer) + " ms");
    }
}
