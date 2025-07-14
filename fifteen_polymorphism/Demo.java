package fifteen_polymorphism;

public class Demo {

    // many forms/variations --> method overloading
    // 1st variation
    public void add(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    // 2nd variation 
    public void add(double a, double b){
        System.out.println("Sum: "+(a+b));
    }

    // 3rd variation 
    public void add(double a, double b, int c){
        System.out.println("Sum: "+(a+b+c));
    }

    // 4th variation 
    public void add(int a, int b, int c){
        System.out.println("Sum: "+(a+b+c));
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(5, 10);
        d.add(5.5, 5.6);
    }

}
