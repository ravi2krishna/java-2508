package tweleve_inheritance;

public class Dog extends Animal {
    String animal = "Dog";
    public void display() {
        System.out.println("Dog Displayed");
    }

    public void show() {
        display();
        super.display();
    }
}
