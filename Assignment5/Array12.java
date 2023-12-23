// K-th Element of Two Sorted Arrays

// Given two sorted arrays of size m and n respectively, you are tasked with
// finding the element that would be at the k’th position of the final sorted array.
// Examples:
// Input : Array 1 - 2 3 6 7 9
// Array 2 - 1 4 8 10
// k = 5
// Output : 6
// Explanation: The final sorted array would be -
// 1, 2, 3, 4, 6, 7, 8, 9, 10
// The 5th element of this array is 6.

import java.util.Scanner;

class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter first array element : ");
            arr[i] = sc.nextInt();
        }
         System.out.print("Enter second array size : ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for(int i=0; i<arr1.length; i++){
            System.out.print("Enter second array element : ");
            arr1[i] = sc.nextInt();
        }
        int arr3[] = new int[size+size1];
        // for(int i=0; i<arr.length; i++){
        //     arr3[i] = arr[i];
        // }
            // for(int i=0; i<arr.length; i++){
            //     System.out.println(arr[i]);
            // }
            // for(int i=0; i<arr1.length; i++){
            //     System.out.println(arr1[i]);
            // }

        for(int i=0; i<size+size1; i++){
            
            if(i<size){
                arr3[i] = arr[i];
            }
            else{
                arr3[i] = arr1[i-size];
            }
            //  System.out.println(arr3[i]);
        }
         int temp = 0;
        for(int i=0; i<size+size1; i++){
            for(int j=i+1; j<size+size1; j++){
                if(arr3[i]>arr3[j]){
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                    
                }
            }
            System.out.println("The final sorted array : "+arr3[i]);
        }
        System.out.print("Enter index number : ");
        int k = sc.nextInt();
        System.out.print("The "+k+ " element of this array is : "+arr3[k-1]);
    }
}
        
