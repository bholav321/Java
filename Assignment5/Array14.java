// Find the Rotation Count in Rotated Sorted array

// Given an array arr[] of size N having distinct numbers sorted in increasing
// order and the array has been right rotated (i.e, the last element will be
// cyclically shifted to the starting position of the array) k number of times, the
// task is to find the value of k.
// Examples:
// Input: arr[] = {15, 18, 2, 3, 6, 12}

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int minInd = 0;
        int min = 0;

        for(int i=0; i<size; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                min = arr[0];
                minInd = i;
            }
        }
        System.out.println("Routation count = "+minInd);
        
        
        
    }
}
