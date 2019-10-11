package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int number = 0;
        int input = 0;

        System.out.print("I will add up the numbers you give me.\n");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Number: ");
            input = in.nextInt();
            if (input == 0) {
                System.out.println();
                System.out.println("The total is " + number + ".");
                break;
            }
            number += input;
            System.out.print("The total so far is " + number + "\n");
        }
    }
}
