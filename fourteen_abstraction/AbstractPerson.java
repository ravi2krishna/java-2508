package fourteen_abstraction;

public abstract class AbstractPerson {
    // implement encapsulation by using private 
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;
    private String personDescription;

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

    public String getPersonDescription() {
        return personDescription;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
    }

}
