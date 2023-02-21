package HW;
public class Prokhvatilova_2_2 {

    public static void main(String[] args) {
        float weeklyHours = Float.parseFloat(args[0]);
        float hourlyRate = Float.parseFloat(args[1]);
        float taxPercentage = Float.parseFloat(args[2]);

        double salaryMonth = weeklyHours * hourlyRate * Main.WORKING_MONTH_WEEKS;
        double salaryYear = salaryMonth * Main.WORKING_MONTHS;
        double salaryMonthTax = salaryMonth - salaryMonth * taxPercentage / 100;
        double salaryYearTax = salaryMonthTax * Main.WORKING_MONTHS;

        String salaryMonthMessage = String.format("Monthly salary before taxes: %.2f", salaryMonth);
        String salaryMonthTaxMessage = String.format("Monthly salary after taxes: %.2f", salaryMonthTax);
        String salaryYearMessage = String.format("Yearly salary before taxes: %.2f", salaryYear);
        String salaryYearTaxMessage = String.format("Yearly salary after taxes: %.2f", salaryYearTax);

        String resultMessage = salaryMonthMessage + "\n" + salaryMonthTaxMessage + "\n" +
                salaryYearMessage + "\n" + salaryYearTaxMessage;

        Main.PrintToConsole(resultMessage);

    }
}