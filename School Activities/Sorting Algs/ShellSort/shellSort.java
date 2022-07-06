package ShellSort;

import java.util.Arrays;
import java.util.Scanner;

public class shellSort {

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
            sort(array);
        }

    }

    public static void sort(int[] array) {
        int buffer = 1;
        int size = array.length;
        int index;

        while (buffer == 1 || (size > 1)) {

            buffer = 0;
            size = (size + 1) / 2;

            for (index = 0; index < (array.length - size); index++) {

                if (array[index + size] < array[index]) {

                    int temp = array[index + size];
                    array[index + size] = array[index];
                    array[index] = temp;
                    buffer = 1;
                }

            }
            System.out.println("Value of array in iteration " + (index) + "\n" + Arrays.toString(array));

        }
    }
}
