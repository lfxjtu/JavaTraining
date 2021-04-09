package JavaTraining.Assignment4;

import java.util.Scanner;

public class CountNumber {
    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    public static void main(String[] args) {
        int nextInt;

        System.out.print("Please input an integer. input 's' to stop: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            try {
                nextInt = Integer.parseInt(nextLine);
                countNumber(nextInt);
            } catch (NumberFormatException e) {
                if ("s".equals(nextLine)) {
                    System.out.printf("finish the count. The total positive input is %d, the total negative input is %d, the total zeros input is %d.", positiveCount, negativeCount, zeroCount);
                    return;
                }
            }
        }
    }

    private static void countNumber(int nextInt) {
        if (nextInt > 0) {
            positiveCount++;
        } else if (nextInt < 0) {
            negativeCount++;
        } else
            zeroCount++;
    }
}
