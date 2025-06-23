package eight;

public class WithOutThis {
    
    // instance variable
    int x;
    int y;

    // explicit constructor without parameters -> what values you wanted, you defined
    public WithOutThis () {
     x = 100;
     y = 200;   
    }

    // explicit constructor with parameters -> what values you wanted, you defined
    public WithOutThis (int x, int y) {
        // the above x & y are Local Variables
        x = x;
        y = y;   
    }

    public int addNumbers () {
        return x+y;
    }

    public static void main(String[] args) {
        int a = 1; // local variable
        System.out.println(a);
        WithOutThis t1 = new WithOutThis(); 
        System.out.println("sum of values from default "+t1.addNumbers());

        WithOutThis t2 = new WithOutThis(10,20);
        System.out.println("sum of values from parametrised "+t2.addNumbers());
    }

}

