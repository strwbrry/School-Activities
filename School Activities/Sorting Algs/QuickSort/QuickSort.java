import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] array, int left, int right) {

        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (array[j] <= pivot) {

                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }

    public static void quick_sort(int[] array, int left, int right) {

        if (left < right) {

            int sorted = partition(array, left, right);

            quick_sort(array, left, sorted - 1); // quick sort the left part
            quick_sort(array, sorted + 1, right); // quick sort the right part
        }
    }

    public static void main(String[] Args) {
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
            System.out.println("before Sorting");
            System.out.println(Arrays.toString(array));

            quick_sort(array, 0, size - 1);

            System.out.println("After Sorting");
            System.out.println(Arrays.toString(array));
        }

    }

}