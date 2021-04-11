package JavaTraining.Assignment4;

import java.util.Scanner;

public class CountNumber {
    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    public static void main(String[] args) {
        float nextFloat;

        System.out.println("Please input an float number. input 'ENTER' for another number, input 's' to stop: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            try {
                nextFloat = Float.parseFloat(nextLine);
                countNumber(nextFloat);
            } catch (NumberFormatException e) {
                if ("s".equals(nextLine)) {
                    System.out.printf("finish the count. The total positive input is %d, the total negative input is %d, the total zeros input is %d.", positiveCount, negativeCount, zeroCount);
                    return;
                }
            }
        }
    }

    private static void countNumber(float nextFloat) {
        if (nextFloat > 0) {
            positiveCount++;
        } else if (nextFloat < 0) {
            negativeCount++;
        } else
            zeroCount++;
    }
}
