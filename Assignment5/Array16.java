// Q.16 Rearrange array such that even positioned are greater than odd
// Given an array A of n elements, sort the array according to the following
// relations :
//  , if i is even, ∀ 1 <= i < n
//  , if i is odd , ∀ 1 <= i < n
// Print the resultant array.
// Examples :
// Input : A[] = {1, 2, 2, 1}
// Output : 1 2 1 2

import java.util.Scanner;

class Test{
    public static void main(String[] args){
       int arr[] = {1,3,5,6,7};
        int temp;
        for(int i=1; i< arr.length; i++){
            if(i%2==0){
                if(arr[i]>arr[i-1]){
                    temp = arr[i-1]; 
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            else{
                if(arr[i]<arr[i-1]){
                    temp = arr[i-1]; 
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}