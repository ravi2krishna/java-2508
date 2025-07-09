package fourteen_abstraction;

public class User {
    public static void main(String[] args) {
        // Abstraction
        Laptop lenovo = new Lenovo();
        lenovo.usbA();
        lenovo.usbC();
        lenovo.hdmi();
        
        // No-Abstraction
        HP hp = new HP();
        hp.usbA();
        hp.usbC();
        hp.hdmi();
        hp.ethernet();
        

    }
}
