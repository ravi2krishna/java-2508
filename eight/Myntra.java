package eight;

public class Myntra {
    
    String name;
    String fullName;
    String mobileNumber;
    String emailID;
    String location;

    // Hover On Profile
    public Myntra () {
        name = "Ravi";
    }

    // Click On Profile
    public Myntra (String fullName, String mobileNumber, String emailID, String location) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.location = location;
    }
    
    public static void main(String[] args) {
        
        // Hover -> Object should be initialised with only name
        // Myntra hover = new Myntra();
        // System.out.println("Hovering: "+hover.name);

       //  Click -> Object should be initialised with only fullName, mobileNumber, emailID etc
        Myntra click = new Myntra("Ravi Krishna", "99999999", "ravi2krishna@gmail.com", "Hyderabad");
        System.out.println("When Clicked");
        System.out.println(click.fullName );
        System.out.println(click.mobileNumber );
        System.out.println(click.location );

    }
}
