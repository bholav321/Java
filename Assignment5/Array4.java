import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = {1,2,3,4,5};
		System.out.println("Swap first and last element");
		for (int i = 0; i < array.length; i++) {
			int temp = array[0];
			array[0] = array[array.length-1];
			array[array.length-1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}