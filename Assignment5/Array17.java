// Print All Distinct Elements of a given integer array
// Given an integer array, print all distinct elements in an array. The given array
// may contain duplicates and the output should print every element only once.
// The given array is not sorted.
// Examples:

// Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
// Output: 12, 10, 9, 45, 2

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver; 

class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        int i,j;
        for( i=0; i<arr.length; i++){
            for( j=0; j<arr.length; j++){
                if(arr[i] == arr[j])
                break;  
            }
            if(i==j)
            System.out.println(arr[i]);
        }
        
    }
}