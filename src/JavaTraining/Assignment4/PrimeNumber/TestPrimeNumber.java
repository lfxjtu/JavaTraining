package JavaTraining.Assignment4.PrimeNumber;

import java.util.Scanner;

public class TestPrimeNumber {
    public static void main(String[] args) {
        int numberInput;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input a positive integer: ");
        numberInput = scanner.nextInt();
        Boolean isPrimeNumber = true;
        for (int i=2; i<numberInput; i++){
            if(numberInput%i==0) {
                isPrimeNumber = false;
                break;
            }
        }
        if(isPrimeNumber){
            System.out.println("This is a prime number.");
        }else
            System.out.println("This is not a prime number.");
    }
}
