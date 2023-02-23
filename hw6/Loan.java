package javaCoreHW.hw6;
public class Loan {
    private String loanID;
    private String loanHolderName;
    private String loanStartDate;
    private double loanAmount;
    private double interestRate;
    private int months;

    public Loan(String loanID, String loanHolderName, String loanStartDate, double loanAmount, double interestRate, int months) {
        this.loanID = loanID;
        this.loanHolderName = loanHolderName;
        this.loanStartDate = loanStartDate;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.months = months;
    }

    public Loan(String loanID, String loanHolderName, String loanStartDate) {
        this(loanID, loanHolderName, loanStartDate, 0, 0, 0);
    }

    public double calculateMonthlyPayment() {
        double monthlyRate = interestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        return monthlyPayment;
    }

    public double calculateTotalPayment() {
        double totalPayment = calculateMonthlyPayment() * months;
        return totalPayment;
    }

    public String getLoanID() {
        return loanID;
    }

    public String getLoanHolderName() {
        return loanHolderName;
    }

    public String getLoanStartDate() {
        return loanStartDate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getMonths() {
        return months;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMonths(int months) {
        this.months = months;
    }
    public static void main(String[] args) {
    }
}
/*
4. Описати клас кредит. (Самостійно визначаєте поля і методи)
 */