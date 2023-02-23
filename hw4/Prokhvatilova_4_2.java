package javaCoreHW.hw4;
import javaCoreHW.Main;
import java.util.Arrays;

public class Prokhvatilova_4_2 {
    private static int[] getArray(String[] args, int[] array){
        int i;
        for (i = 0; i < args.length; i++) {
            try {
                array[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException nfe) {
                array[i] = Integer.parseInt(null);
            }
        }
        return array;
    }
    private static int[] sortArrayAsc(int[] array){
        int i;
        boolean change = true;
        while (change) {
            change = false;
            for ( i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    change = true;
                }
            }
        }
        return array;
    }
    private static int[] sortArrayDesc(int[] array){
        int i;
        boolean change = true;
        while (change) {
            change = false;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i + 1]>array[i]) {
                    int tmp = array[i+1];
                    array[i+1]=array[i];
                    array[i] = tmp;
                    change = true;
                }
            }
        }
        return array;
    }
    private static int[] sortArrayInt(int[] array, int[] innerArray){
        Arrays.sort(array);
        int i ;
        int repeat = 1;
        for (i = array.length; i > 0; i--) {
            if ((array.length-i) % 2 == 0) {
                innerArray[(array.length-i)/2] = array[i-1];
            } else {
                innerArray[(array.length-repeat)] = array[i-1];
                repeat++;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int [args.length];
        array = getArray(args, array);
        Main.PrintToConsole("base " + Arrays.toString(array));

        array = sortArrayAsc(array);
        Main.PrintToConsole("\n" +"asc " + Arrays.toString(array));

        array = sortArrayDesc(array);
        Main.PrintToConsole ("\n" +"desc " + Arrays.toString(array));

        int[] innerArray = new int [args.length];
        innerArray = sortArrayInt(array, innerArray);
        Main.PrintToConsole ("\n" +"inner " + Arrays.toString(innerArray));
    }
}
