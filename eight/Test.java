package eight;

public class Test {
    
    // instance variable
    int x;
    int y;

    // explicit constructor without parameters -> what values you wanted, you defined
    public Test () {
     x = 100;
     y = 200;   
    }

    // explicit constructor with parameters -> what values you wanted, you defined
    public Test (int x, int y) {
        // the above x & y are Local Variables
     this.x = x;
     this.y = y;   
    }

    public int addNumbers () {
        return x+y;
    }

    public static void main(String[] args) {
        int a = 1; // local variable
        System.out.println(a);
        Test t1 = new Test(); 
        System.out.println("sum of values from default "+t1.addNumbers());

        Test t2 = new Test(10,20);
        System.out.println("sum of values from parametrised "+t2.addNumbers());
    }

}
