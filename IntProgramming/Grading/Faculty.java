public class Faculty{
    private String firstName;
    private String lastName;

    Faculty(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String setName(String firstName){
        this.firstName = firstName;
        return this.firstName;
    }
    public String getlastName(){
        return this.lastName;
    }
    public String  getfirstName(){
        return this.firstName;
    }
    public String setfirstName(){
        return this.firstName;
    }
}
