package SelectionSort;

import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        int arrLength = array.length;

        for (int i = 0; i < arrLength - 1; i++) {
            System.out.println("Iteration " + (i + 1));
            int leastNumber = i;

            for (int j = i + 1; j < arrLength; j++) {

                if (array[j] < array[leastNumber]) {
                    System.out.println("Compare " + array[j] + "," + array[leastNumber]);
                    System.out.println("Place " + array[j] + "!");
                    leastNumber = j;
                    System.out.println("Least Number is:" + array[leastNumber]);
                }
            }

            int tempStorage = array[i];
            array[i] = array[leastNumber];
            array[leastNumber] = tempStorage;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int size, buffer;

            // This is asking the user to enter the size of the
            // List
            System.out.print("Enter the Size of the List: ");
            size = sc.nextInt();

            // This is asking the user to enter the
            // elements of the List
            int[] array = new int[size];
            System.out.print("Enter Elements of the List: ");

            for (buffer = 0; buffer < size; buffer++) {
                array[buffer] = sc.nextInt();

            }
            System.out.println("Before Sorting");
            System.out.println(Arrays.toString(array));

            selectionSort(array);

            System.out.println("After sorting");
            System.out.println(Arrays.toString(array));
        }

    }

}
