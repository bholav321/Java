class Test {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 12
		for (i = 1; i <= 5; i++) { 				// 1 3
			for (j = 1; j <= i; j++) { 			// 1  4
				if (i == 5 || j == 1 || i == j) // 12345
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 22
		for (i = 1; i <= 5; i++) { 				// 3 3
			for (j = 1; j <= i; j++) { 			// 4  4
				if (i == 5 || j == 1 || i == j) // 55555
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 	// A
		char i, j; 								// AB
		for (i = 'A'; i <= 'E'; i++) { 			// A C
			for (j = 'A'; j <= i; j++) { 		// A  D
				if (i == 'E'||j == 'A'||i == j) // ABCDE
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 	// a
		char i, j; 								// b c
		char a = 'a'; 							// d   f
		for (i = 'a'; i <= 'e'; i++) { 			// g     j
			for (j = 'a'; j <= i; j++) { 		// k l m n o
				if (i == 'e'||j == 'a'||i == j)
					System.out.print(a);
				else
					System.out.print(" ");
				a++;
			}
			System.out.println(" ");
		}
	}
}
