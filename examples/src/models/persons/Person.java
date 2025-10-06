package models.persons;

public class Person {
    private String fullName;

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void walk() {
        System.out.println(this.fullName + " is Walking...");
    }
}
