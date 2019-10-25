package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int valueToFind;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + array.toString());

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        valueToFind = in.nextInt();
        System.out.println();

        if (array.lastIndexOf(valueToFind) != -1) {
            System.out.println(valueToFind + " is in slot " + array.lastIndexOf(valueToFind) + ".");
        } else {
            System.out.println(valueToFind + " is not in the ArrayList.");
        }
    }
}
