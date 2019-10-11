package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = in.nextLine();

        System.out.print("Ok, " + name + ", how old are you? ");
        age = in.nextInt();
        System.out.println();

        if (age < 16) {
            System.out.println("You can't drive, " + name +".");
        } else if (age >= 16 && age <18) {
            System.out.println("You can drive but not vote, " + name +".");
        } else if (age >= 17 && age < 25) {
            System.out.println("You can vote but not rent a car, " + name +".");
        } else {
            System.out.println("You can do pretty much anything, " + name +".");
        }

    }
}
