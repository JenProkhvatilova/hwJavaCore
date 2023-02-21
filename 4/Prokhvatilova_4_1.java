package HW;

import java.util.Scanner;

public class Prokhvatilova_4_1 {
    private static void printFigures() {
        boolean stop = true;
        String message = "Please enter a 0 or 1 number. Thanks! ";

        while (stop) {
            stop = false;
            boolean newFigure = true;
            int figure = Main.getUserChoiceInt("Which figure would you like to draw? Enter 1 for rectangle," +
                    " 2 for right triangle, 3 for inverted right triangle, and 4 for triangle. ");
            switch (figure) {
                case 1:
                    int height = Main.getUserChoiceInt("Enter the desired height of the rectangle: ");
                    int width = Main.getUserChoiceInt("Enter the desired width of the rectangle: ");
                    drawRectangle(height, width);
                    break;
                case 2:
                    height = Main.getUserChoiceInt("Enter the desired height of the right triangle: ");
                    drawRightTriangle(height);
                    break;
                case 3:
                    height = Main.getUserChoiceInt("Enter the desired height of the inverted right triangle: ");
                    drawInvertedRightTriangle(height);
                    break;
                case 4:
                    height = Main.getUserChoiceInt("Enter the desired height of the triangle: ");
                    drawTriangle(height);
                    break;
                default:
                    Main.PrintToConsole(message + "\n");
                    newFigure = false;
                    stop = true;
                    break;
            }

            while (newFigure == true) {
                int print = Main.getUserChoiceInt("Do you want to print another figure? Enter 1 for Yes and 0 for No: ");
                if (print == 1) {
                    stop = true;
                    newFigure = false;
                } else if (print == 0) {
                    stop = false;
                    newFigure = false;
                } else {
                    Main.PrintToConsole(message + "\n");
                    newFigure = true;
                    stop = true;
                }
            }
        }

    }

    private static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawInvertedRightTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int c = 0; c < i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int c = 0; c < (2 * i) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFigures();
    }
}
