class Test {
	public static void main(String[] args) { 		// *
		int i, j; 									//  *
		for (i = 1; i <= 5; i++) { 					//   *
			for (j = 1; j <= i; j++) { 				//    *
				if (i == j) 						//     *
					System.out.println("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		// 0
		int i, j; 									// 1 1
		for (i = 1; i <= 5; i++) { 					// 0 0 0
			for (j = 1; j <= i; j++) { 				// 1 1 1 1
				if (i % 2 == 0) 					// 0 0 0 0 0
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println(" ");
		}
	}

}

class Test2 {
	public static void main(String[] args) { 	// *
		int i, j; 								// * *
		for (i = 1; i <= 5; i++) { 				// * * *
			for (j = 1; j <= i; j++) { 			// * * * *
				System.out.print("*"); 		// * * * * *
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 1 2
		for (i = 1; i <= 5; i++) { 				// 1 2 3
			for (j = 1; j <= i; j++) { 			// 1 2 3 4
				System.out.print(j); 			// 1 2 3 4 5
			}
			System.out.println(" ");
		}
	}
}

class Test4 {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 2 2
		for (i = 1; i <= 5; i++) { 				// 3 3 3
			for (j = 1; j <= i; j++) { 			// 4 4 4 4
				System.out.print(i); 			// 5 5 5 5 5
			}
			System.out.println(" ");
		}
	}
}

class Test5 {
	public static void main(String[] args) { 	// A
		char i, j; 								// A B
		for (i = 'A'; i <= 'E'; i++) { 			// A B C
			for (j = 'A'; j <= i; j++) { 		// A B C D
				System.out.print(j); 			// A B C D E
			}
			System.out.println(" ");
		}
	}
}

class Test6 {
	public static void main(String[] args) { 	// a
		char i, j; 								// a b
		for (i = 'a'; i <= 'e'; i++) { 			// a b c
			for (j = 'a'; j <= i; j++) { 		// a b c d
				System.out.print(j); 			// a b c d e
			}
			System.out.println(" ");
		}
	}
}
