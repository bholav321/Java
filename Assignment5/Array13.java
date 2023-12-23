// Find Subarray with given sum | Set 1 (Non-negative Numbers)
//  Given an array arr[] of non-negative integers and an integer sum, find a
// subarray that adds to a given sum.
// Note: There may be more than one subarray with sum as the given sum, print
// first such subarray.
// Examples:
// Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
// Output: Sum found between indexes 2 and 4
// Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33   
   
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
        System.out.println("Enter index number : ");
        System.out.print("Index number : ");
        int num1 = sc.nextInt();
        System.out.print("Index number : ");
        int num2 = sc.nextInt();
        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum found between index"+num1+ "and " +num2+" =" +sum);
    }
}