package jcquizone;

public class Ninja {
    private String name;

    public Ninja(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void displayName(){
        System.out.println(name);
    }
}
