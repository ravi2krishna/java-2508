package fourteen_abstraction;

public class HP implements Laptop {

    public void usbA(){
        System.out.println("HP USB A");
    }

    public void hdmi() {
        System.out.println("HP HDMI");
    }

    public void usbC() {
        System.out.println("HP USB C");
    }

    public void ethernet() {
        System.out.println("HP ETHERNET");
    }

}
