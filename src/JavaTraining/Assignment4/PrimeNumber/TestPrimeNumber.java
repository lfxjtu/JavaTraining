package JavaTraining.Assignment4.PrimeNumber;

import java.util.Scanner;

public class TestPrimeNumber {
    public static void main(String[] args) {
        int numberInput;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input a positive integer: ");
        numberInput = scanner.nextInt();

        if(numberInput == 1) {
            System.out.println("1 is not a prime integer.");
            return;
        }
        Boolean isPrimeNumber = true;
        for (int i=2; i<numberInput; i++){
            if(numberInput%i==0) {
                isPrimeNumber = false;
                break;
            }
        }
        if(isPrimeNumber){
            System.out.printf("%d is a prime number.",numberInput);
        }else
            System.out.printf("%d is not a prime number.", numberInput);
    }
}
