package thirteen_encapsulation;

public class TestPerson {

    public String publicName = "Public Name";
    private String privateName = "Private Name";
    protected String protectedName = "Protected Name";
    String defaultName = "Default Name"; // if you don't specify any access modifier, then default is default

    public void display() {
        System.out.println("Inside Same Class");
        System.out.println(publicName);
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(defaultName);
    }

}
