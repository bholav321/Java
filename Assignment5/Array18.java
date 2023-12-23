// Write a program to print all the LEADERS in the array. An element is a
// leader if it is greater than all the elements to its right side. And the rightmost
// element is always a leader.
// For example:
// Input: arr[] = {16, 17, 4, 3, 5, 2},
// Output: 17, 5, 2
// Input: arr[] = {1, 2, 3, 4, 5, 2},
// Output: 5, 2

import java.util.Scanner;

class Test {
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
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j])
                break;
            }
            if (j == arr.length)
            System.out.println(arr[i]);
            }
    }
}

