import java.util.Scanner;

public class Que27 {
    public void searching(int arr[]){
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(ele==arr[i]){
                System.out.println(arr[i]);
                System.out.println("Position of element in array is : "+(i+1));
                break;
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
            System.out.println("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        Que27 obj = new Que27();
        obj.searching(arr);
    }
}