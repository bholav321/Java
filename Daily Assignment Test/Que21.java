import java.util.Scanner;

public class Que21 {
    public void searching(int arr[]){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter search element : ");
        int ele = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(ele==arr[i]){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element Found ");
        }
        else{
            System.out.println("Element Not Found ");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        Que21 obj = new Que21();
        obj.searching(arr);
    }
}
