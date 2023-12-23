class Test {
	public static void main(String[] args) { 	//    *
		int i, j, sp, c = 1; 					//   ***
		for (i = 1; i <= 7; i += 2) { 			//  *****
			for (sp = 4; sp >= c; sp--) { 		// *******
				System.out.print(" "); 		//  *****
			}c++;								//   ***
			for (j = 1; j <= i; j++) { 			//    *
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (i = 5; i >= 1; i -= 2) {
			for (sp = 7; sp >= i; sp -= 2) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		//    *
		int i, j, sp, c = 1; 						//   *_*
		for (i = 1; i <= 7; i += 2) { 				//  *___*
			for (sp = 4; sp >= c; sp--) { 			// *_____*
				System.out.print(" "); 			//  *___*
			}c++;									//   *_*
			for (j = 1; j <= i; j++) { 				//    *
				if (j == 1 || i == j)
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
			for (j = 1; j <= i; j++) {
				if (j == 1 || i == j)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == 1 || i == 9 || j == 1 || j == 9 || i == j || i == 2 && j == 8 || i == 3 && j == 7
						|| i == 4 && j == 6 || i == 6 && j == 4 || i == 7 && j == 3 || i == 8 && j == 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
