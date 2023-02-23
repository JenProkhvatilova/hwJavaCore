package javaCoreHW.hw4;
import javaCoreHW.Main;

public class Prokhvatilova_4_3 {

    public static void main(String[] args) {

        double loanAmount = Main.getUserChoiceDouble("Enter the total loan amount: ");
        double monthlyInterestRate  = Main.getUserChoiceDouble("Enter the monthly interest rate: ");
        int choice;
        boolean isDone;

        do {
            choice = Main.getUserChoiceInt("Choose an option: " +
                    "1 - Calculate the number of monthly payments until the loan is fully paid; " +
                    "2 - Calculate the monthly payment amount. ");

            String resultMessage;

            switch (choice) {
                case 1:
                    double monthlyPayment = Main.getUserChoiceDouble("Enter the monthly payment amount ");
                    int numberOfPayments = calculateNumberOfPayments(loanAmount, monthlyPayment, monthlyInterestRate);
                    resultMessage = "Number of monthly payments " + numberOfPayments;
                    break;
                case 2:
                    float numberOfPayments2 = Main.getUserChoiceFloat("Enter the number of payments ");
                    double monthlyPayment2 = calculateMonthlyPayment(loanAmount, numberOfPayments2, monthlyInterestRate);
                    resultMessage = "Monthly payment amount: " + monthlyPayment2;
                    break;
                default:
                    resultMessage = "Please enter a valid option (1 or 2). Thanks!";
                    break;
            }
            Main.PrintToConsole(resultMessage);
            isDone = !(choice == 1 || choice == 2);
        } while (isDone);
    }
    private static int calculateNumberOfPayments(double loanAmount, double monthlyPayment, double monthlyInterestRate) {
        int numberOfPayments = 0;
        while (loanAmount > 0) {
            loanAmount = (loanAmount - monthlyPayment) * (1 + monthlyInterestRate/100);
            numberOfPayments++;

        }
        return numberOfPayments;
    }
    private static double calculateMonthlyPayment(double loanAmount, float numberOfPayments, double monthlyInterestRate) {
        double futureValue = loanAmount * Math.pow((1 + monthlyInterestRate), numberOfPayments);
        return (futureValue * monthlyInterestRate) / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
    }
}
