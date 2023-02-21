package HW;

import java.util.Scanner;

public class Main {

    public static final int WORKING_MONTHS = 12;
    public static final int WORKING_MONTH_WEEKS = 4;
    public static final byte DAILY_WORKING_HOURS = 8;
    public static final byte WEEK_DAYS = 7;

    public static void PrintToConsole(String message){
        System.out.println(message);
    }
    public static float getUserChoiceFloat (String userMessage){
        Scanner in = new Scanner(System.in);
        System.out.print(userMessage);
        float info = in.nextFloat();
        return info;
    }
    public static int getUserChoiceInt (String userMessage){
        Scanner in = new Scanner(System.in);
        System.out.print(userMessage);
        int info = in.nextInt();
        return info;
    }
    public static double getUserChoiceDouble (String userMessage){
        Scanner in = new Scanner(System.in);
        System.out.print(userMessage);
        double info = in.nextDouble();
        return info;
    }

    public static void main(String[] args) {
    }
}
