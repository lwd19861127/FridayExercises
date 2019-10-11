package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Hello.  What is your name? ");
        name = in.nextLine();
        System.out.println();

        System.out.print("Hi, " + name + "!  How old are you? ");
        age = in.nextInt();
        System.out.println();

        System.out.print(String.format("Did you know that in five years you will be " +
                "%d years old?\n" + "And five years ago you were %d! Imagine that!", age+5, age-5));
    }
}
