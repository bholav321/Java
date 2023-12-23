import java.util.Scanner;

class Array11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<arr.length; i++){
	   System.out.print("Enter array element : ");
	   arr[i] = sc.nextInt();
	}
	int i,j;
	for( i=0; i<arr.length; i++){
	     for( j=0; j<arr.length; j++){
		if(arr[i]==arr[j]){
		  break;
		}
		
	     }
	     if(i==j){
		System.out.print(arr[i]);
	     }
	}
    }
}