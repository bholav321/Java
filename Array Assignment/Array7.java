import java.util.Scanner;

public class Array7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1st array size : ");
        // int size1 = sc.nextInt();
        // System.out.print("Enter 2nd array size : ");
        // int size2 = sc.nextInt();
        int arr[] = {2,3,4,5,6};
        int arr1[] = {7,8,9,10};
        int arr2[] = new int[9];

        // for(int i=0; i<arr.length; i++){
        //     System.out.print("Enter 1st array element : ");
        //     arr[i] = sc.nextInt();
        // }
        
        // for(int i=0; i<arr1.length; i++){
        //     System.out.print("Enter 2nd array element : ");
        //     arr1[i] = sc.nextInt();
        // }
        for(int i=0; i<arr2.length; i++){
            if(i<5){
                arr2[i] = arr[i];
            }
            else{
                arr2[i] = arr1[i-5];
            }
        }
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
