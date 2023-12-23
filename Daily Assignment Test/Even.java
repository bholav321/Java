import java.util.Scanner;

public class Even {
    public void array(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
class Testmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        Even obj = new Even();
        obj.array(arr);
    }
}