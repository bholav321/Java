// Check for Majority Element in a sorted array
// Examples:
// Input: arr[] = {1, 2, 3, 3, 3, 3, 10}, x = 3
// Output: True (x appears more than n/2 times in the given array)

import java.util.Scanner;

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
        int a = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
            if(arr[i]==arr[j])
            a = arr[i];
            }
        }
        System.out.print("Majority Element : "+a);
    }
    
}