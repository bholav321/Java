class Test {
	public static void main(String[] args) { 		// *****
		int i, j; 									// *  *
		for (i = 1; i <= 5; i++) { 					// * *
			for (j = 5; j >= i; j--) { 				// **
				if (j == 5 || i == 1 || i == j) 	// *
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		// ABCDE
		char i, j; 									// A  D
		for (i = 'E'; i>='A'; i--) {				// A C
			for (j = 'A'; j <= i; j++) { 			// AB
				if (j == 'A' || i == 'E' || i == j) // A
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 		// *****
		int i, j; 									// ####
		for (i = 1; i <= 5; i++) { 					// ***
			for (j = 5; j >= i; j--) { 				// ##
				if (i % 2 == 0) 					// *
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 		// 55555
		int i, j; 									// 4  4
		for (i = 5; i>=1; i--) { 					// 3 3
			for (j = 1; j <= i; j++) { 				// 22
				if (j == 1 || i == 5 || i == j) 	// 1
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

													// *
class Test4 { 										// **
	public static void main(String[] args) { 		// ****
		int i, j; 									// *******
		for (i = 1; i <= 5; i++) { 					// ***********
			for (j = 1; j <= 11; j++) {
				if (i == 5 || i == 4 && j <= 7 || i == 3 && j <= 4 || i == 2 && j <= 2 || i == 1 && j <= 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test5 {
	public static void main(String[] args) {	// A
		char i, j;								// AB
		for (i = 'A'; i <= 'E'; i++) {			// ABC
			for (j = 'A'; j <= i; j++) {		// ABCD
				System.out.print(j);			// ABCDE
			}
			System.out.println(" ");
		}
	}
}
