package HW;
import java.util.Scanner;


public class Prokhvatilova_2_3 {

    private static Float calculateHourlyRate (float weeklyHours, float annualIncome, float taxPercentage) {
        float hourlyRate = annualIncome * 100 / ((100 - taxPercentage) * Main.WORKING_MONTHS * Main.WORKING_MONTH_WEEKS
                * weeklyHours);
        return hourlyRate;
    }

    public static void main (String[] args) {
        float weeklyHours = Main.getUserChoiceFloat("Enter weekly working hours: ");
        float annualIncome = Main.getUserChoiceFloat("Enter annual income after tax: ");
        float taxPercentage = Main.getUserChoiceFloat("Enter tax percentage: ");

        float hourlyRate = calculateHourlyRate(weeklyHours, annualIncome, taxPercentage);

        String resultMessage = String.format("For %.2f weekly working hours and an annual income of %.2f with " +
                "a tax rate of %.2f%%, the hourly rate is %.2f", weeklyHours, annualIncome, taxPercentage, hourlyRate);
        Main.PrintToConsole(resultMessage);
    }
}