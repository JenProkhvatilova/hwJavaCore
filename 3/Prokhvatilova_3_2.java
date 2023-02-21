package HW;
import java.util.Scanner;
public class Prokhvatilova_3_2 {


    private static double[] calculateCost(int goodsQuantity, float price, double[] arrayCostDiscount) {
        double discount;

        if (goodsQuantity > 10 & goodsQuantity <= 20) {
            discount = 5; // 5%
        } else if (goodsQuantity > 20 & goodsQuantity <= 30) {
            discount = 10; // 10%
        } else if (goodsQuantity > 30 & goodsQuantity <= 80) {
            discount = 12f + 0.4f * ((goodsQuantity - 30) / 10); // 12% +0.4%
        } else if (goodsQuantity > 80) {
            discount = 13; // 13%
        } else {
            discount = 0; // 0%
        }
        arrayCostDiscount[0] = goodsQuantity * price * (100.0 - discount) / 100.0;
        arrayCostDiscount[1] = discount;
        return arrayCostDiscount;

    }

    public static void main(String[] args) {

        String message = "Please enter a positive number. Thanks!";

        float price = Float.parseFloat(args[0]);
        String choiceMessage = "Please enter the quantity of the item you would like to purchase: ";
        int goodsQuantity = Main.getUserChoiceInt(choiceMessage);

        while (goodsQuantity <= 0) {
            Main.PrintToConsole(message);
            goodsQuantity = Main.getUserChoiceInt(choiceMessage);
        }

        double[] arrayCostDiscount = new double[2];
        arrayCostDiscount = calculateCost(goodsQuantity, price, arrayCostDiscount);
        double cost = arrayCostDiscount[0];
        double discount = arrayCostDiscount[1];

        message = String.format("For quantity %d the discount is %.2f%%, with price %.2f cost is %.2f",
                goodsQuantity, discount, price, cost);

        Main.PrintToConsole(message);
    }
}
