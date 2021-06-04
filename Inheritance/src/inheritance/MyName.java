package inheritance;

public class MyName {

    private String firstName;
    private String lastName;
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public MyName() {
        this.firstName = "Dexter";
        this.middleName = "Reyes";
        this.lastName = "Tampioc";
    }
    

    public MyName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MyName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    

//    public void displayName() {
//        System.out.printf();
//    }

    @Override
    public String toString() {
       return String.format("%s, %s %s", this.lastName, this.firstName, this.middleName);
    }

}
