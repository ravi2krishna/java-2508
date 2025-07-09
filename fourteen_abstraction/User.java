package fourteen_abstraction;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.usbA();
        lenovo.usbC();
        lenovo.hdmi();
        lenovo.oledDisplay();
        Laptop.microSD();

        HP hp = new HP();
        hp.usbA();
        hp.usbC();
        hp.hdmi();
        hp.ethernet();
        hp.oledDisplay();
        Laptop.microSD();

    }
}
