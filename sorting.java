import java.util.*;
public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={7,8,3,1,2};

        //bubble sort
        /*for(int i=0;i<arr.length-1;i++){   //n-1
            for(int j=0;j<arr.length-i-1;j++){  //n-i-1
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }*/

        // insertion sort
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
                    //placement
            arr[j+1]=curr;
        }
        printArray(arr);
    }
}  //tc-O(N^2) not a good tc for sorting
