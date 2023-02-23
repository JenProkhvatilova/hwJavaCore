package javaCoreHW.hw4;
import javaCoreHW.Main;

public class Prokhvatilova_4_4 {
    private static void calculateSalaryMonthYear(float priceH, float tax){
        int startDays = 0;
        double salaryMonth = 0;
        double yearSalary = 0;
        double salaryMonthTax = 0;
        double yearSalaryTax = 0;


        for (int month = 1; month <= 12; month++) {
            int totalDays;
            switch (month) {
                case 2:
                    totalDays = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDays = 30;
                    break;
                default:
                    totalDays = 31;
                    break;
            }

            int fullWeeks = (totalDays - startDays) / Main.WEEK_DAYS;
            int lastWeekDays = totalDays - startDays - fullWeeks * Main.WEEK_DAYS;
            int aStartDays = 0;
            int bLastWeekDays = 0;

            if (startDays >= 2) {
                aStartDays = startDays - 2;
            } else if (startDays == 1) {
                aStartDays = startDays - 1;
            } else {
                aStartDays = startDays;
            }

            switch (lastWeekDays) {
                case 6:
                    bLastWeekDays = 1;
                    break;
                case 7:
                    bLastWeekDays = 2;
                    break;
                default:
                    bLastWeekDays = lastWeekDays;
                    break;
            }
            int workingD = aStartDays + fullWeeks * 5 + bLastWeekDays;
            startDays = 7 - lastWeekDays;

            salaryMonth = Main.DAILY_WORKING_HOURS * priceH * workingD;
            salaryMonthTax = salaryMonth - salaryMonth * tax / 100;

            String messageMonth = getMonthName(month);

            System.out.printf("%s %.2f %.2f%n", messageMonth, salaryMonth, salaryMonthTax);

            yearSalary += salaryMonth;
            yearSalaryTax += salaryMonthTax;
        }
        System.out.printf("TOTAL %.2f %.2f%n", yearSalary, yearSalaryTax);
    }
    private static String getMonthName(int month) {
        String[] monthNames = {
                "JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
        };
        return monthNames[month - 1];
    }

    public static void main(String[] args) {
        float priceH = Float.parseFloat(args[0]);
        float tax = Float.parseFloat(args[1]);

        calculateSalaryMonthYear(priceH, tax);
    }
}
