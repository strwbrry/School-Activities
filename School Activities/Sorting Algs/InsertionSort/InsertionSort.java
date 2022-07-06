import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size;

            // This is asking the user to enter the size of the
            // List
            System.out.print("Enter the Size of the List: ");
            size = sc.nextInt();

            // This is asking the user to enter the
            // elements of the List
            int[] array = new int[size];
            System.out.print("Enter Elements of the List: ");
            for (int buffer = 0; buffer < size; buffer++) {
                array[buffer] = sc.nextInt();
            }

            // Printing the array in a string format.
            System.out.println(Arrays.toString(array));

            // This is the Insertion Sort Algorithm.
            System.out.println("This is Insertion Sort");

            for (int i = 1; i < size; i++) { // i = index

                System.out.println();
                System.out.println("Iteration " + i);

                int current = array[i]; // current = the element to be inserted in the correct spot
                int j = i - 1; // j = sets to start in the previous index

                while (j >= 0 && array[j] > current) {

                    System.out.println();
                    System.out.println("Compare " + array[j] + " , " + current);
                    System.out.println("Insert " + current);
                    System.out.println(Arrays.toString(array));

                    array[j + 1] = array[j];
                    j--;
                }

                System.out.println();
                System.out.println("No Swap ");
                array[j + 1] = current;
                System.out.println(Arrays.toString(array));
            }

            // This is printing the final sorted array.
            System.out.println("Sorted List ");
            System.out.println(Arrays.toString(array));
        }
    }

}
