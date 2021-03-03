package JavaTraining.Assignment3_ScannerStudentMarks;

import java.util.Scanner;

public class Student {
    String name;
    String gender;
    int subject1;
    int subject2;
    int subject3;
    int subject4;
    int subject5;

    public Student() {
        Scanner studentInput = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        name = studentInput.next();
        System.out.printf("Enter your gender: ");
        gender = studentInput.next();
        System.out.printf("Enter your mark of subject 1: ");
        subject1 = studentInput.nextInt();
        System.out.printf("Enter your mark of subject 2: ");
        subject2 = studentInput.nextInt();
        System.out.printf("Enter your mark of subject 3: ");
        subject3 = studentInput.nextInt();
        System.out.printf("Enter your mark of subject 4: ");
        subject4 = studentInput.nextInt();
        System.out.printf("Enter your mark of subject 5: ");
        subject5 = studentInput.nextInt();
        System.out.println("Your information is: ");
        System.out.printf("Name: %s, Gender: %s, subject 1: %d,subject 2: %d, subject 3: %d, subject 4: %d, subject 5: %d \n",
                name, gender, subject1, subject2, subject3, subject4, subject5);
    }

    public void calculateGrade() {
        /*
Distinction : Each subject greater than 60% marks and total greater than 80%
First class : Each subject more than 60% marks and total less than 80%
Second Class : Each Subject more than 40% marks and total less than 60%
Fail : Any subject less than 35% marks
         */
        int total = (subject1 + subject2 + subject3 + subject4 + subject5)/5;
        if (subject1 > 60 && subject2 > 60 && subject2 > 60 && subject2 > 60 && subject2 > 60 && total>80) {
            System.out.printf("Hi %s, Congratulations ! You passed the exam with a Distinction.",name);
        }else if (subject1 > 60 && subject2 > 60 && subject3 > 60 && subject4 > 60 && subject5 > 60 && total<=80){
            System.out.printf("Hi %s, Congratulations ! You passed the exam with a First Class.",name);
        }else if (subject1 > 40 && subject2 > 40 && subject3 > 40 && subject4 > 40 && subject5 > 40 && total<=60){
            System.out.printf("Hi %s, Congratulations ! You passed the exam with a Second Class.",name);
        }else if (subject1 < 35 || subject2 < 35 || subject3 < 35 || subject4 < 35 || subject5 < 35){
            System.out.printf("Hi %s, You failed the exam.",name);
        }else
            System.out.printf("Hi %s, Congratulations ! you passed the exam.", name);
    }
}
