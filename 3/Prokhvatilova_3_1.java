package HW;
import java.util.Scanner;
public class Prokhvatilova_3_1 {

    private static String determineNumberType(int num) {
        String messageIsEven;
        if ((num % 2) == 0) {
            messageIsEven = "even";
        } else {
            messageIsEven = "odd";
        }

        String messageIsPositive;
        if (num > 0) {
            messageIsPositive = "positive";
        } else if (num == 0) {
            messageIsPositive = "zero";
        } else {
            messageIsPositive = "negative";
        }


        String messageIsPrime;
        boolean isPrime = true;
        if (num <= 1) {
            messageIsPrime = "not a prime";
        } else {
            for (int i = 2; i <= (num / 2); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                messageIsPrime = "prime";
            } else {
                messageIsPrime = "composite";
            }
        }
        return String.format("The entered number %d is %s, %s, and %s.", num, messageIsEven, messageIsPositive, messageIsPrime);
    }

    public static void main(String[] args) {
        int num = Main.getUserChoiceInt("Enter the number:");
        String resultMessageNum = determineNumberType(num);
        Main.PrintToConsole(resultMessageNum);
    }
}