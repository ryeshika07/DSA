import java.util.*;

public class rot1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of size n

        // Input all array elements first
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Store the first element
        int t = arr[0];

        // Shift elements to the left
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }

        // Move the first element to the last
        arr[n - 1] = t;

        // Print the rotated array
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
//TC- O(N)
//SC-O(1)   THIS IS EXTRA SPACE
//BUT FOR THIS PROBLRM I AM USING O(N)
