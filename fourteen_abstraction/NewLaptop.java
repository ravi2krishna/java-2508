package fourteen_abstraction;

// Governing body for creating laptops
// contract for building laptops

public interface NewLaptop {
    
    public void usbA();

    public void hdmi();

    public void usbC();

    public void oledDisplay(); // newly added --> this causes issues for all implemented classes

}