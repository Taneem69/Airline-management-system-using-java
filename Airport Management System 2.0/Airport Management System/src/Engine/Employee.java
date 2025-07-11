package Engine;

public class Employee extends Person {
    private String id;
    private String role;

    public Employee(String name, int age, String id, String role, String nationality, String phoneNumber) {
        super(name, age, nationality, phoneNumber);
        this.id = id;
        this.role = role;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void showDetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("ID : " + this.getId());
        System.out.println("Role : " + this.getRole());
        System.out.println("Nationality : " + this.getNationality());
        System.out.println("Phone number  : " + this.getPhoneNumber());
        System.out.println();
    }
}
