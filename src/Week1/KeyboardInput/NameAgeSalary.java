package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        double salary = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        name = in.nextLine();
        System.out.println();
        System.out.println("Hi, " + name + "!  How old are you?");
        age = in.nextInt();
        System.out.println();
        System.out.println("So you're " + age + ", eh?  That's not old at all!\n" +
                "How much do you make, " + name + "?");
        salary = in.nextDouble();
        System.out.println();
        System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");
    }
}
