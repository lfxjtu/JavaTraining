package JavaTraining.Polymorphism.Assignment3;

public class TestMember {

    public static void main(String[] args) {
        Member member01 = new Member("John");
        member01.setName("John Lennon");
        member01.setAge(30);
        member01.setPhoneNumber("+642888888");
        member01.setAddress("19 Aitken Street, Thorndon, Wellington");
        member01.setSalary(10000);

        Member member02 = new Member("Paul McCartney",34,"+642666666","19 Aitken Street, Thordon", 9999);

        System.out.println("member01 name is " + member01.getName() + ". He lives in " + member01.getAddress());
        member01.printSalary();
        System.out.println("member02 name is  " + member02.getName() + ". He is " + member02.getAge() + " years old.");
        member02.printSalary();

        Employee employee = new Employee("John",20, "0255555555", "fake building, fake suburb, Wellington", 2000);
        employee.setSpecialization("Software development");
        System.out.printf("employee info: %s, %d, %s, %s, %d, %s\n",employee.getName(),employee.getAge(), employee.getPhoneNumber(), employee.getAddress(), employee.getSalary(), employee.getSpecialization());
        Manager manager = new Manager("Paul", 40, "022222222", "true building, true suburb, Wellington", 20000);
        manager.setDepartment("NTK");
        System.out.printf("manager info: %s, %d, %s, %s, %d, %s",manager.getName(),manager.getAge(), manager.getPhoneNumber(), manager.getAddress(), manager.getSalary(), manager.getDepartment());
    }
}
