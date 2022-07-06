package SearchingAlgs;
import java.util.*;


public class binary_search {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    int[] array = new int[25];
    for (int i = 0; i < array.length; i++) {
        

         array[i] = rd.nextInt(100);
    }
    Arrays.sort(array);

    System.out.println(Arrays.toString(array));

    System.out.print("Find Element: ");
    int find = sc.nextInt();
    
    

    int result = binarySearch(array, 0, array.length - 1, find);

        if (result == -1) {

             System.out.println("Element Doesn't Exist!");
        }

        else {

            System.out.println("Element Found at index: " + result);

        }
    }

    public static int binarySearch(int[] array, int low, int high, int find){
        
        int i=0;
        while(low <= high){
            i++;
            System.out.format("Iteration %d \n" ,i);
            int mid = (high + low)/ 2;

            System.out.format("mid index %d = (high %d + low %d) / 2 \n",mid, high, low);

            if(array[mid] == find){

                System.out.println("Comparison " + array[mid] + " = " + find);
                System.out.format("Found! %d \n",mid );

                return mid;
            
            }
            if (find < array[mid]) {

                System.out.format("Find %d < Mid %d \n", find, array[mid]);
                
                
                high = mid - 1;
                System.out.format("High is now: %d = (mid %d - 1) \n",high , mid);

            }
            else{

                System.out.format("Find %d > Mid %d \n", find, array[mid]);

                low = mid + 1;
                
                System.out.format("Low is now: %d = (mid %d + 1) \n", low, mid);

            }
        }
        

        return -1;
    }
}