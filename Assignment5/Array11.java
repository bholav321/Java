// Q.12 Find the number of zeroes
// Given an array of 1s and 0s which has all 1s first followed by all 0s. Find the
// number of 0s. Count the number of zeroes in the given array.
// Examples :
// Input: arr[] = {1, 1, 1, 1, 0, 0}
// Output: 2

import java.util.Scanner;

class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter array element in 0 and 1 form : ");
            arr[i] = sc.nextInt();
        }
        int a = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
            a++;
        }
        System.out.print("number of zeros : "+a);
    }
}