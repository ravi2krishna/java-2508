package thirteen_encapsulation;

public class Person {

    // implement encapsulation by using private 
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;

    // setters & getters
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        // validation like age should be positive only
        if (personAge > 0) {
            this.personAge = personAge;
        } else {
            System.out.println("Invalid Age Provided");
        }

    }

    public int getPersonMobileNumber() {
        return personMobileNumber;
    }

    public void setPersonMobileNumber(int personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }
    
    // display student info --> complete details --> click -> show profile
    public void displayInfo() {
        System.out.println("ID: "+personID);
        System.out.println("NAME: "+personName);
        System.out.println("MOBILE: "+personMobileNumber);
        System.out.println("AGE: "+personAge);
    }

}
