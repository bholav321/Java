import java.util.Scanner;

class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array element");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]){
					temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}
}