package Week2.Arrays;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int valueToFind = 0;
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 50 + 1);
        }
        System.out.print("Array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        valueToFind = in.nextInt();
        System.out.println();

        boolean finded = false;
        for(int i = 0; i < array1.length; i++) {
            if (valueToFind == array1[i]) {
                finded = true;
                System.out.println(valueToFind + " is in slot " + i + ".");
            }
        }
        if (!finded) {
            System.out.println(valueToFind + " is not in the array.");
        }
    }
}
