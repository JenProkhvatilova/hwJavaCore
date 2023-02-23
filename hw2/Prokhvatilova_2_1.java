package javaCoreHW.hw2;
import javaCoreHW.Main;
public class Prokhvatilova_2_1 {
    public static void main(String[] args) {
        int power = Integer.parseInt(args[0]);
        int number = Integer.parseInt(args[1]);
        long result = (long) Math.pow(number, power);

        String resultMessage = number + " raised to power " + power + " is : " + result;
        Main.PrintToConsole(resultMessage);
    }
}