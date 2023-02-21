package HW;

import java.util.Scanner;

public class Prokhvatilova_3_3 {

    private static double calculateSalaryMonth(int month, float hourlyRate) {
        byte workingDays = 0;
        int i;
        int s;

        if (month == 2) {
            workingDays = 20;
        } else {
            int[] month31 = new int[]{1, 3, 5, 7, 8, 10, 12};
            i = month31.length - 1;
            while (i >= 0) {
                if (month == month31[i]) {
                    workingDays = 23; //4*5+3
                    break;
                } else {
                    i--;
                }
            }
            int[] month30 = new int[]{4, 6, 9, 11};
            s = month30.length - 1;
            while (s >= 0) {
                if (month == month30[s]) {
                    workingDays = 22; //4*5+2
                    break;
                } else {
                    s--;
                }
            }
        }
        double salaryMonth = Main.DAILY_WORKING_HOURS * hourlyRate * workingDays;
        return salaryMonth;
    }

    private static double calculateSalaryMonthTax(float taxPercentage, double salaryMonth) {
        double salaryMonthTax = salaryMonth *( 1-  taxPercentage / 100);
        return salaryMonthTax;
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        float hourlyRate = Float.parseFloat(args[1]);
        float taxPercentage = Float.parseFloat(args[2]);
        String resultMessage;
        double salaryMonth = calculateSalaryMonth(month, hourlyRate);
        double salaryMonthTax = calculateSalaryMonthTax(taxPercentage, salaryMonth);

        if (month <= 0 || month > 12) {
            resultMessage = "Please enter a number between 1 and 12. Thanks!";
        } else {
            resultMessage = "Salary per month before taxes: " + salaryMonth + "\n" +
                    "Salary per month after taxes: " + salaryMonthTax;
        }

        Main.PrintToConsole(resultMessage);
    }

}
