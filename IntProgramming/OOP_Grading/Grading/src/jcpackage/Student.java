package jcpackage;

public class Student {
    private String name;
    private int score;
    private String streetAddress;

    Student(String name, int score, String streetAddress) {
        this.name = name;
        this.score = score;
        this.streetAddress = streetAddress;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
