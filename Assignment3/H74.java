class Test {
	public static void main(String[] args) { 	//    *
		int i, j, sp, c = 1; 					//   *_*
		for (i = 1; i <= 9; i += 2) { 			// 	*___*
			for (sp = 4; sp >= c; sp--) { 		// *_____*
				System.out.print(" "); 		//*********
			}
			c++;
			for (j = 1; j <= i; j++) {
				if (i == 9 || j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 	//    1
		int i, j, sp, c = 1; 					//   1*1
		for (i = 1; i <= 9; i += 2) { 			//  1***1
			for (sp = 4; sp >= c; sp--) { 		// 1*****1
				System.out.print(" "); 		//111111111
			}
			c++;
			for (j = 1; j <= i; j++) {
				if (i == 9 || j == 1 || j == i)
					System.out.print("1");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		char i, j, sp, c = 'A'; 				//    A
		char a = 'A'; 							//   B B
		for (i = 'A'; i <= 'I'; i += 2) { 		//  C   C
			for (sp = 'D'; sp >= c; sp--) { 	// D     D
				System.out.print(" "); 		//EEEEEEEEE
			}
			c++;
			for (j = 'A'; j <= i; j++) {
				if (i == 'I' || j == 'A' || j == i)
					System.out.print(a);
				else
					System.out.print(" ");
			}
			a++;
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 	//    #
		int i, j, sp, c = 1; 					//   *#*
		for (i = 1; i <= 9; i += 2) { 			//  **#**
			for (sp = 4; sp >= c; sp--) { 		// ***#***
				System.out.print(" "); 		//****#****
			}
			c++;
			for (j = 1; j <= i; j++) {
				if (i == 1 && j == 1 || i == 3 && j == 2 || i == 5 && j == 3 || i == 7 && j == 4 || i == 9 && j == 5)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test4 {
	public static void main(String[] args) { 	// *********
		int i, j, sp; 							//  *******
		for (i = 9; i >= 1; i -= 2) { 			//   *****
			for (sp = 9; sp >= i; sp -= 2) { 	//    ***
				System.out.print(" "); 		//     *
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test5 {
	public static void main(String[] args) { 	//* * * * *
		int i, j, sp; 							// * * * *
		for (i = 5; i >= 1; i--) { 				//  * * *
			for (sp = 5; sp >= i; sp--) { 		//   * *
				System.out.print(" "); 		//    *
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println(" ");
		}
	}
}

class Test6 {
	public static void main(String[] args) { 	//123456789
		int i, j, sp; 							// 1234567
		for (i = 9; i >= 1; i -= 2) { 			//  12345
			for (sp = 9; sp >= i; sp -= 2) { 	//   123
				System.out.print(" "); 		//    1
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}

class Test7 {
	public static void main(String[] args) { 	//A B C D E
		char i, j, sp; 							// A B C D
		for (i = 'E'; i >= 'A'; i--) { 			//  A B C
			for (sp = 'E'; sp >= i; sp--) { 	//   A B
				System.out.print(" "); 		//    A
			}
			for (j = 'A'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}
	}
}

class Test8 {
	public static void main(String[] args) { 	//5 5 5 5 5
		int i, j, sp; 							// 4 4 4 4
		for (i = 5; i >= 1; i--) { 				//  3 3 3
			for (sp = 5; sp >= i; sp--) { 		//   2 2
				System.out.print(" "); 		//    1
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println(" ");
		}
	}
}
