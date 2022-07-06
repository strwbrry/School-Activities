import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int arrLength = array.length;

        if (arrLength < 2) { // This is checking if the length of the array is less than 2.

            return; // If it is less than 2, it will return.
        }

        int midPoint = array.length / 2; // This is splitting the array into two parts.
        int portSide[] = new int[midPoint];
        int starBoard[] = new int[arrLength - midPoint];

        for (int i = 0; i < midPoint; i++) { // This is taking the first half of the array and

            portSide[i] = array[i]; // putting it into the portSide array.
        }

        for (int i = midPoint; i < arrLength; i++) { // This is taking the second half of the array and

            starBoard[i - midPoint] = array[i]; // putting it into the starBoard array.
        }

        mergeSort(portSide);
        mergeSort(starBoard);

        merge(array, portSide, starBoard); // Merging the two arrays together.

    }

    private static void merge(int[] array, int[] portSide, int[] starBoard) {
        int portSize = portSide.length;
        int starSize = starBoard.length;

        int i = 0, j = 0, k = 0;
        while (i < portSize && j < starSize) {

            if (portSide[i] <= starBoard[j]) {

                System.out.println();
                System.out.println("Compare " + portSide[i] + " , " + starBoard[j]);
                System.out.println(Arrays.toString(array));

                array[k] = portSide[i];
                i++;

            } else {

                System.out.println();
                System.out.println("Compare " + portSide[i] + " , " + starBoard[j]);
                System.out.println(Arrays.toString(array));

                array[k] = starBoard[j];
                j++;
            }

            k++;
        }

        while (i < portSize) { // This is taking the remaining elements of the

            array[k] = portSide[i]; // portSide array and putting it into the array.
            i++;
            k++;
        }

        while (j < starSize) { // This is taking the remaining elements of the

            array[k] = starBoard[j]; // starBoard array and putting it into the array.
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size, buffer;

            System.out.print("Enter the Size of the List: "); // Asking the user to enter the size of the List / Array
            size = sc.nextInt();

            int[] array = new int[size];
            System.out.print("Enter Elements of the List: "); // Asking the user to enter the elements in the List
            for (buffer = 0; buffer < size; buffer++) {
                array[buffer] = sc.nextInt();
            }

            System.out.println("Array Beofre Sorting "); // Printing the array before sorting in a string format.
            System.out.println(Arrays.toString(array));

            mergeSort(array); // Calling the mergeSort method and passing the array as a parameter.

            System.out.println("After Sorting"); // This is printing the array after sorting in a string format.
            System.out.println(Arrays.toString(array));
        }
    }

}