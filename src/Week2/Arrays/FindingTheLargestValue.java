package Week2.Arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.print("Array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        int max = array1[0];
        for (int i:array1) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The largest value is " + max);
    }
}
