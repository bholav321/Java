class Test {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 0 1
		for (i = 1; i <= 5; i++) { 				// 1 0 1
			for (j = 1; j <= i; j++) { 			// 0 1 0 1
				if ((i + j) % 2 == 0) 			// 1 0 1 0 1
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 2 3
		int a = 1; 								// 4 5 6
		for (i = 1; i <= 4; i++) { 				// 7 8 9 10
			for (j = 1; j <= i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 	// A
		char i, j; 								// B B
		for (i = 'A'; i <= 'E'; i++) { 			// C C C
			for (j = 'A'; j <= i; j++) { 		// D D D D
				System.out.print(i); 			// E E E E E
			}
			System.out.println(" ");
		}
	}

}

class Test3 {
	public static void main(String[] args) { 	// a
		char i, j; 								// b c
		char a = 'a'; 							// d e f
		for (i = 'a'; i <= 'e'; i++) { 			// g h i j
			for (j = 'a'; j <= i; j++) { 		// k l m n o
				System.out.print(a);
				a++;
			}
			System.out.println(" ");
		}
	}

}
