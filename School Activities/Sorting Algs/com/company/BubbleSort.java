import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Asking the user to enter the size of the list.
            int size, buffer, data;
            System.out.print("Enter the Size of the List: ");
            size = sc.nextInt();

            // This is asking the user to enter
            // the elements of the array.
            int[] array = new int[size];
            System.out.print("Enter Elements of the List: ");
            for (buffer = 0; buffer < size; buffer++) {
                array[buffer] = sc.nextInt();
            }
            sc.close();

            // Printing the array in a string format.
            System.out.println(Arrays.toString(array));

            // Printing the string "This is Bubble Sort"
            System.out.println("This is Bubble Sort ");

            // This is the bubble sort algorithm.
            for (int i = 0; i < size - 1; i++) {
                System.out.println();
                System.out.println("Iteration " + (i + 1));
                for (int j = 0; j < size - 1 - i; j++) {

                    if (array[j] > array[j + 1]) {

                        System.out.println();
                        System.out.println("Compare " + array[j] + "," + array[j + 1]);
                        System.out.println("Swap ");

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        System.out.println(Arrays.toString(array));

                    } else {

                        System.out.println();
                        System.out.println("Compare " + array[j] + "," + array[j + 1]);
                        System.out.println("No Swap");
                        System.out.println(Arrays.toString(array));
                    }
                }
            }

            // Printing the array in a string format
            // after Bubble Sort.
            System.out.println("Final Sort");
            System.out.println(Arrays.toString(array));
        }
    }
}