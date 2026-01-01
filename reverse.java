/*import java.util.Arrays;
// USING TEMPORARY ARRAY
class reverse {
    
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Temporary array to store elements
        // in reversed order
        int[] temp = new int[n];
  
        // Copy elements from original array
        // to temp in reverse order
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
  
        // Copy elements back to original array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
} // IN THIS TC- O(N) AND SC- 0(N)*/

// USING TWO POINTERS
/*import java.util.Arrays;

class reverse {
    
    // function to reverse an array
    static void reverseArray(int[] arr) {
        
        // Initialize left to the beginning
        // and right to the end
        int left = 0, right = arr.length - 1;

        // Iterate till left is less than right
        while (left < right) {
            
            // Swap the elements at left
            // and right position
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Increment the left pointer
            left++;

            // Decrement the right pointer
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}// O(N)-TC O(1)-SC*/

//BY SWAPPING ELEMENTS
import java.util.Arrays;

class reversse {
    
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Iterate over the first half 
        // and for every index i, swap
        // arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
} //TC-ON SC- O1

