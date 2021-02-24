/**
 * this is the assignment of JAVA training, session 1
 * version: 0.1
 * author: Fang Liu
 */

package Session1;


public class printEmployee {
    public static void main(String[] args) {
        Employee employee01 = new Employee(),
                employee02 = new Employee(),
                employee03 = new Employee();
        initEmployee(employee01, "Robert ", 1994, "M", "abcfdr", 1200.00f);
        initEmployee(employee02, "Samanth", 2000, "F", "fdufuf", 17769.40f);
        initEmployee(employee03, "John   ", 2012, "M", "26B-  ", 4500.00f);

        System.out.println("Name     JoiningYear  Gender     Address       salary     ");
        printEmployee(employee01);
        printEmployee(employee02);
        printEmployee(employee03);
    }

    //This is to initialise an employee with given data;
    private static void initEmployee(Employee employee, String name, Integer joiningYear, String gender, String address, Float salary) {
        employee.name = name;
        employee.joiningYear = joiningYear;
        employee.gender = gender;
        employee.address = address;
        employee.salary = salary;
    }

    //This is to print data of an employee
    private static void printEmployee(Employee employee) {
        System.out.printf("%s       %d        %s      %s       %.2f \n", employee.name, employee.joiningYear, employee.gender, employee.address, employee.salary);

    }

}
