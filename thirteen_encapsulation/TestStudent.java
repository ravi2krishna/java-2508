package thirteen_encapsulation;

public class TestStudent {
    // instance variables
    private int id;
    String name;
    boolean isAttended;

    // let's set student id
    // public TestStudent(int id) {
    //     this.id = id;
    // }

    // setter method to set data
    public void setID(int id) {
        this.id = id;
    }

    // getter method to get data
    public int getID(){
        return id;
    }

}
