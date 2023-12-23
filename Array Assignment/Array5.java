import java.util.Scanner;

public class Array5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        int pos =3;
        int x = 100;
        for(int i=0; i<size; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        
        for(int i=5; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = x;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
