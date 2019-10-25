package Week2.Arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] randomNumber = new int[10];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Slot " + i + " contains a " + randomNumber[i]);
        }
    }
}
