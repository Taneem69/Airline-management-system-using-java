package Engine;

public abstract class Person {
    private String name;
    private int age;
    private String nationality;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, int age, String nationality, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public abstract void showDetails();
}