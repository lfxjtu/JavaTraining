package JavaTraining.Assignment4.ReverseNumbers;

import java.util.Scanner;

public class TestReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please inputInt an integer number: ");
        int inputInt = scanner.nextInt();
        String reverseInt = reverse(inputInt);
        System.out.println("The reverseInt number of your inputInt is: " + reverseInt);

    }

    public static String reverse(int inputInt) {
        String s = String.valueOf(inputInt);
        int len = s.length();
        StringBuilder newString = new StringBuilder(len);

        for (int i = (len - 1); i >= 0; i--){
            newString.append(s.charAt(i));
        }
        return newString.toString();
    }
}
