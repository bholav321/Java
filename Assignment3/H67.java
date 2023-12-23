class Test {
	public static void main(String[] args) { 		// *
		int i, j; 									// * *
		for (i = 1; i <= 5; i++) { 					// * @ *
			for (j = 1; j <= i; j++) { 				// * @ @ *
				if (i == 5 || j == 1 || i == j) 	// * * * * *
					System.out.print("*");
				else
					System.out.print("@");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		// 5
		int i, j; 									// 5 4
		for (i = 5; i >= 1; i--) { 					// 5 4 3
			for (j = 5; j >= i; j--) { 				// 5 4 3 2
				System.out.print(j); 				// 5 4 3 2 1
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 		// *
		int i, j; 									// * #
		for (i = 1; i <= 5; i++) { 					// * # *
			for (j = 1; j <= i; j++) { 				// * # * #
 				if(j%2==1)							// * # * # *
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 		// 1
		int i, j; 									// 1 0
		for (i = 1; i <= 5; i++) { 					// 1   1
			for (j = 1; j <= i; j++) { 				// 1     0
				if (i == 5 || j == 1 || i == j) { 	// 1 0 1 0 1
					if (j % 2 == 0) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
