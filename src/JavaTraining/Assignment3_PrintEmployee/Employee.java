/**
 * This is a class to accommodate employee data
 * version: 0.1
 * author: Fang Liu
 */
package JavaTraining.Assignment3_PrintEmployee;


public class Employee {
    String name;
    Integer joiningYear;
    String gender;
    String address;
    Float salary;

    //This is to initialise an employee with given data;
    public Employee(String name1, Integer joiningYear1, String gender1, String address1, Float salary1) {
        name = name1;
        joiningYear = joiningYear1;
        gender = gender1;
        address = address1;
        salary = salary1;
    }

    //This is to print the employee data;
    public void printEmployeeInfo() {
        System.out.printf("%10s,%10d,%10s,%15s,%15.2f\n", name, joiningYear, gender, address, salary);

    }
}

