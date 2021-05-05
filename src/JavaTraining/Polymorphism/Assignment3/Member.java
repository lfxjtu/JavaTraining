package JavaTraining.Polymorphism.Assignment3;

public class Member {

    String Name;
    int Age;
    String PhoneNumber;
    String Address;
    int Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Member(String name) {
        Name = name;
    }

    public Member(String name, int age, String phoneNumber, String address, int salary) {
        Name = name;
        Age = age;
        PhoneNumber = phoneNumber;
        Address = address;
        Salary = salary;
    }

    public void printSalary(){
        System.out.println("member salary: " + getSalary());
    }

}
