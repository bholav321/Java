// Q.9 Find a peak element which is not smaller than its neighbours

// Given an array arr[] of integers. Find a peak element i.e. an element that is not
// smaller than its neighbors.
// Note: For corner elements, we need to consider only one neighbor.
// Example:
// Input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less
// than 20.
// nput: array[] = {10, 20, 15, 2, 23, 90, 67}
// Output: 20 or 90
// Explanation: The element 20 has neighbors 10 and 15, both of them are less
// than 20, similarly 90 has neighbors 23 and 67.
// The following corner cases give a better idea about the problem.
// 1. If the input array is sorted in a strictly increasing order, the last element is
// always a peak element. For example, 50 is peak element in {10, 20, 30, 40,
// 50}.

// 2. If the input array is sorted in a strictly decreasing order, the first element is
// always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
// 3. If all elements of the input array are the same, every element is a peak
// element.
// It is clear from the above examples that there is always a peak element in the
// input array.
// Follow the below steps to Implement the idea:
//  If the first element is greater than the second or the last element is greater
// than the second last, print the respective element and terminate the
// program.
//  Else traverse the array from the second index to the second last index
// i.e. 1 to N – 1
// If for an element array[i] is greater than both its neighbours, i.e., and, then
// print that element and terminate.

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
       for(int i=1; i<size-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            System.out.print("Peak Element : " +arr[i]);
       }
    }
}