package Week1.Classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,7, "Blue");
        rectangle1.draw();
        System.out.println();

        Rectangle rectangle2 = new Rectangle(10,2, "Green");
        rectangle2.draw();
        System.out.println();

        Rectangle rectangle3 = new Rectangle(15,12, "Red");
        rectangle3.draw();
    }
}
