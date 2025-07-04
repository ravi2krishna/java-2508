package tweleve_inheritance;

public class LMSAdmin extends Person {
    
    public LMSAdmin(){
        System.out.println("Default Called");
    }

    // Set constructor for Admin to set ID & Name
    public LMSAdmin(int AdminID, String AdminName, int AdminMobileNumber, int AdminAge, String AdminDescription, double courseFee){
        super(AdminID, AdminName, AdminAge, AdminMobileNumber);
    }

    void displayAdminJob(){
        System.out.println("Admin Work Done");
    }
}
