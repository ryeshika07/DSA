import java.util.*;

public class secondlar {
    /*public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of size n
        int l = arr[0]; // Initialize l to the smallest possible integer
        int sl = -1; // Initialize second largest to the smallest possible integer
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // Read each element into the array
            if (arr[i] > l) {
                sl = l; // Update second largest before updating largest
                l = arr[i]; // Update largest
            } else if (arr[i] > sl && arr[i] != l) {
                sl = arr[i]; // Update second largest if current element is not equal to largest
            }
        }
        
        System.out.println("Second largest element is: " + sl); // Print the second largest element
    }*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of size n
         // Initialize second largest to the smallest possible integer
        int ss = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE; // Initialize largest to the smallest possible integer
        for (int i = 1; i < arr.length; i++) {
            
            arr[i] = scn.nextInt(); // Read each element into the array
            
            if (arr[i] < s) {
                ss = s; // Update second largest before updating largest
                s = arr[i]; // Update largest
            } else if (arr[i] < ss && arr[i] != s) {
                ss = arr[i]; // Update second largest if current element is not equal to largest
            }
        }
        
        System.out.println("Second smallest element is: " +ss); // Print the second largest element
    }
    
}
