package fourteen_abstraction;

public interface Personable {

    // every person should have this implementations
    public void setPersonDetails();
    public void displayPersonDetails();

    // Achievement Status
    // public void achievementStatus();
    default void achievementStatus() {}
    
}
