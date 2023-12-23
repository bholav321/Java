import java.util.Scanner;

public class Que26 {
    public void prime(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=2; j<=arr[i]/2; j++){
                if(arr[i]%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(" "+arr[i]);
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
        Que26 obj = new Que26();
        obj.prime(arr);
    }
}
