package jctest11;

public abstract class Employee {
    String level;
    String name;

    Employee(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setLevel(String l) {
        level = l;
    }

    public String getLevel() {
        return level;
    }

    // Abstract method jobDescription() that returns a String
    public abstract String jobDescription();
}