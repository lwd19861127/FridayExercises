package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        int number = 0;

        System.out.print("Count to: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i < number) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
    }
}
