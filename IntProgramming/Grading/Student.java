public class Student{
    private String name;
    private double score;
    private String streetAddress;

    public Student(String name, double score, String streetAddress){
        this.streetAddress = streetAddress;
        this.score = score;
        this.name = name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }
    public String setAddress(String streetAddress){
        this.streetAddress = streetAddress;
        return this.streetAddress;
    }
    public double setScore(int score){
        this.score = score;
        return this.score;
    }

    public double getScore(){
        return this.score;
    }
    public String getAddress(){
        return this.streetAddress;
    }
    public String  getName(){
        return this.name;
    }

    }
