class Test {
	public static void main(String[] args) { 		// 1
		int i, j; 									// 12
		for (i = 1; i <= 4; i++) { 					// 123
			for (j = 1; j <= i; j++) { 				// 1234
				System.out.print(j); 				// 123
			} 										// 12
			System.out.println(" "); 				// 1
		}
		for (i = 3; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}
}

class Test1 {
	public static void main(String[] args) { 		// 1
		int i, j, sp; 								// 12
		for (i = 1; i <= 4; i++) { 					// 123
			for (sp = 4; sp > i; sp--) { 			// 1234
				System.out.print(" "); 			// 123
			} 										// 12
			for (j = 1; j <= i; j++) { 				// 1
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 3; i >= 1; i--) {
			for (sp = 3; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		int i, j; 																// 1
		for (i = 1; i <= 4; i++) { 												// 12
			for (j = 1; j <= i; j++) { 											// 1 3
				if (i == 3 && j == 2 || i == 4 && j == 2 || i == 4 && j == 3) 	// 1  4
					System.out.print(" "); 									// 1 3
				else 															// 12
					System.out.print(j); 										// 1
			}
			System.out.println(" ");
		}
		for (i = 3; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				if (i == 3 && j == 2)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 			//    *
		int i, j, sp, c = 1; 							//   *_*
		for (i = 1; i <= 7; i += 2) { 					//  *_*_*
			for (sp = 4; sp >= c; sp--) { 				// *_*_*_*
				System.out.print(" "); 				//  *_*_*
			}c++; 										//   *_*
			for (j = 1; j <= i; j++) { 					//    *
				if ((i + j) % 2 == 0)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}
		for (i = 5; i >= 1; i -= 2) {
			for (sp = 7; sp >= i; sp -= 2) {
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}

	}
}
