package bankingsystem;

public class Name {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String extension;

    //create your constructors and overload them
    public Name() {
    }

    /* public Name(String title, String firstName, String lastName) {
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    }
    public Name(String title, String firstName, String middleName, String lastName) {
    this.title = title;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    }*/
    public Name(String title, String firstName, String middleName, String lastName, String extension) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.extension = extension;
    }

    //create your neccessary setters and getters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return String.format("%s. %s %s. %s, %s.",
                this.title, this.firstName, this.middleName.charAt(0), this.lastName, this.extension);
    }
}
