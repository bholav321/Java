import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] =  new int[size+1];
        for(int i=0; i<size; i++){
            System.out.print("Enter array element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position where you insert no.. :");
        int pos = sc.nextInt();
        System.out.print("Enter element value : ");
        int x = sc.nextInt();
       
        for(int i=size; i>pos; i--){
           arr[i] = arr[i-1];
        }
        arr[pos] = x;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
         
    }
     
}
