package JavaTraining.Polymorphism.Assignment3;

public class Employee extends Member{
    public Employee(String name) {
        super(name);
    }

    public Employee(String name, int age, String phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String specialization;

}
