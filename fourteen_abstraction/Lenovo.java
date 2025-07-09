package fourteen_abstraction;

public class Lenovo implements Laptop {
    
    public void usbA(){
        System.out.println("Lenovo USB A");
    }

    public void hdmi() {
        System.out.println("Lenovo HDMI");
    }

    public void usbC() {
        System.out.println("Lenovo USB C");
    }

    @Override
    public void oledDisplay() {
        System.out.println("Lenovo OLED Display 42 inches");
    }
}
