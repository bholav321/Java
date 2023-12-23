class Test {
	public static void main(String[] args) { 	//     1
		int i, j, sp, c = 1; 					//    101
		for (i = 1; i <= 11; i += 2) { 			//   10101
			for (sp = 6; sp >= c; sp--) { 		//  1010101
				System.out.print(" "); 		// 101010101
			}c++;								//10101010101
			for (j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println(" ");
		}

	}

}

class Test1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == j || i == 1 && j == 9 || i == 2 && j == 8 || i == 3 && j == 7 || i == 4 && j == 6
						|| i == 6 && j == 4 || i == 7 && j == 3 || i == 8 && j == 2 || i == 9 && j == 1)
					System.out.print(" *");
				else 									// *       *
					System.out.print(" "); 			//  *     *
			} 											//   *   *
			System.out.println(" "); 					//    * *
		} 												//     *		
	} 													//    * *
														//   *   *
														//  *     *
} 														// *       *