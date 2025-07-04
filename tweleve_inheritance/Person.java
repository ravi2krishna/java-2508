package tweleve_inheritance;

public class Person {

    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    Person() {}

    Person(int personID, String personName, int personAge, int personMobileNumber ) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
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
