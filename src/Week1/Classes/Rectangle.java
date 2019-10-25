package Week1.Classes;

public class Rectangle {
    private int width;
    private int height;
    private String color = "Blue";

    public Rectangle(int width, int height) {
        if (width < 0) {
            this.width = 1;
        }
        if (height < 0) {
            this.height = 1;
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color) {
        if (width < 0) {
            this.width = 1;
        }
        if (height < 0) {
            this.height = 1;
        }
        if (color.length() > 2 && color.length() < 20 && (color.charAt(0) >= 'A' && color.charAt(0) <= 'Z')) {
            this.color = color;
        }
        this.width = width;
        this.height = height;
    }

    public void draw() {
        char firstCharacterOfColor = color.charAt(0);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(firstCharacterOfColor);
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
