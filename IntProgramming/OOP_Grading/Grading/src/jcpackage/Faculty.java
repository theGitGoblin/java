package jcpackage;

public class Faculty {
    private String firstName;
    private String lastName;

    Faculty(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
