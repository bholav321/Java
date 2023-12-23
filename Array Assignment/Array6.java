import java.util.Scanner;

public class Array6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int pos = 3;
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        arr[pos] = arr[pos+1];
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }

    }
}
