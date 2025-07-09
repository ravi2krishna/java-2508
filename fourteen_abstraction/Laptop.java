package fourteen_abstraction;

// Governing body for creating laptops
// contract for building laptops

public interface Laptop {
    
    public void usbA();

    public void hdmi();

    public void usbC();

    // public void oledDisplay(); // newly added --> this causes issues for all implemented classes

    default void oledDisplay() {
        System.out.println("Vendor Provided OLED Display 24 inches");
    }

    static void microSD() {
        System.out.println("Fully Implemented Micro SD");
    }

}