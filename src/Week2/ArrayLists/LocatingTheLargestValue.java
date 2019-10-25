package Week2.ArrayLists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 100) + 1);
        }
        System.out.println("ArrayList: " + array.toString());
        System.out.println();

        int max = array.get(0);
        int slot = 0;
        for (Integer i:array) {
            if (i > max) {
                max = i;
                slot = array.indexOf(i);
            }
        }
        System.out.println("The largest value is " + max + ", which is in slot " + slot);
    }
}
