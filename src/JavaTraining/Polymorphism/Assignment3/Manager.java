package JavaTraining.Polymorphism.Assignment3;

public class Manager extends Member{
    public Manager(String name) {
        super(name);
    }

    public Manager(String name, int age, String phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String department;
}
