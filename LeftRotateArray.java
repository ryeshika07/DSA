import java.util.*;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of positions to rotate
        System.out.print("Enter number of positions to rotate left: ");
        int k = sc.nextInt();
        k = k % n; // To avoid overflow if k > n

        // Perform left rotation by k times
        for(int r = 0; r < k; r++) {
            int first = arr[0];
            for(int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        // Output the rotated array
        System.out.println("Array after left rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

