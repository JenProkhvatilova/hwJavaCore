package javaCoreHW.hw11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть речення: ");
        String sentence = scanner.nextLine();

        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                int count = letterCount.getOrDefault(letter, 0);
                letterCount.put(letter, count + 1);
            }
        }

        System.out.println("Кількість кожної літери в реченні:");
        for (char letter : letterCount.keySet()) {
            int count = letterCount.get(letter);
            System.out.println(letter + ": " + count);
        }
    }
}
