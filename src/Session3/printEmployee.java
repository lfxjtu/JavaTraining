/**
 * this is the assignment of JAVA training, session 1
 * version: 0.1
 * author: Fang Liu
 */

package Session3;


public class printEmployee {
    public static void main(String[] args) {
        Employee employee01 = new Employee("Robert", 1994, "M", "abcfdr", 1200.00f);
        Employee employee02 = new Employee("Samanth", 2000, "F", "fdufuf", 17769.40f);
        Employee employee03 = new Employee("John", 2012, "M", "26B-", 4500.00f);

        System.out.println("      Name     JoiningYear   Gender       Address        salary     ");
        employee01.printEmployeeInfo();
        employee02.printEmployeeInfo();
        employee03.printEmployeeInfo();
    }

}
