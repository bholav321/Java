class Test {
	public static void main(String[] args) { 	// *
		int i, j; 								// # #
		for (i = 1; i <= 5; i++) { 				// * * *
			for (j = 1; j <= i; j++) { 			// # # # #
				if (i == 1 || i == 3 || i == 5) // * * * * *
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 	// 1
		int i, j; 								// 1 0
		for (i = 1; i <= 5; i++) { 				// 1 0 1
			for (j = 1; j <= i; j++) { 			// 1 0 1 0
				if (j == 1 || j == 3 || j == 5) // 1 0 1 0 1
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
		for (i = 1; i <= 5; i++) { 				// *   *
			for (j = 1; j <= i; j++) { 			// *     *
				if (j == 1 || i == 5 || i == j) // * * * * *
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

}
