class Test {
	public static void main(String[] args) { // 12345
		int i, j, sp; 						 //  1234
		for (i = 5; i >= 1; i--) { 			 //   123
			for (sp = 4; sp >= i; sp--) { 	 //    12
				System.out.print(" "); 	 	 //     1
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}

class Test1 {
	public static void main(String[] args) { 	// 55555
		int i, j, sp; 							//  4444
		for (i = 5; i >= 1; i--) { 				//   333
			for (sp = 4; sp >= i; sp--) { 		//    22
				System.out.print(" "); 			//     1
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}
}

class Test2 {
	public static void main(String[] args) { 	// 12345
		int i, j, sp; 							//  1__4
		for (i = 5; i >= 1; i--) { 				//   1_3
			for (sp = 4; sp >= i; sp--) { 		//    12
				System.out.print(" "); 			//     1
			}
			for (j = 1; j <= i; j++) {
				if (i == 5 || j == 1 || i == j)
					System.out.print(j);
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}

	}
}

class Test3 {
	public static void main(String[] args) { 	// ABCDE
		char i, j; 								//  ABCD
		char sp; 								//   ABC
		for (i = 'E'; i >= 'A'; i--) { 			//    AB
			for (sp = 'D'; sp >= i; sp--) { 	//     A
				System.out.print(" ");
			}
			for (j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}

class Test4 {
	public static void main(String[] args) { 	// ABCDE
		char i, j; 								//  A__D
		char sp; 								//   A_C
		for (i = 'E'; i >= 'A'; i--) { 			//    AB
			for (sp = 'D'; sp >= i; sp--) { 	//     A
				System.out.print(" ");
			}
			for (j = 'A'; j <= i; j++) {
				if (i == 'E' || j == 'A' || j == i)
					System.out.print(j);
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}

	}

}

class Test5 {
	public static void main(String[] args) { 	// 11111
		int i, j, sp, a = 1; 					//  2222
		for (i = 5; i >= 1; i--) { 				//   333
			for (sp = 4; sp >= i; sp--) { 		//    44
				System.out.print(" "); 		//     5
			}
			for (j = 1; j <= i; j++) {
				System.out.print(a);
			}
			a++;
			System.out.println(" ");
		}

	}
}

class Test6 {
	public static void main(String[] args) { 	//    *
		int i, j, sp; 							//   * *
		int c = 1; 								//  * * *
		for (i = 1; i <= 5; i++) { 				// * * * *
			for (sp = 4; sp >= c; sp--) {		//* * * * *
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println(" ");
		}

	}
}

class Test7 {
	public static void main(String[] args) { 	//    1
		int i, j, sp; 							//   1 2
		int c = 1; 								//  1 2 3
		for (i = 1; i <= 5; i++) { 				// 1 2 3 4
			for (sp = 4; sp >= c; sp--) {		//1 2 3 4 5
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}

	}
}

class Test8 {
	public static void main(String[] args) { 	//    A
		char i, j, sp;							//   A B
		char c = 'A';							//  A B C
		for (i = 'A'; i <= 'E'; i++) { 			// A B C D
			for (sp = 'D'; sp >= c; sp--) { 	//A B C D E
				System.out.print(" ");
			}
			c++;
			for (j = 'A'; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}

	}
}

class Test9 {
	public static void main(String[] args) { 	//    X
		int i, j, sp; 							//   X X
		int c = 1; 								//  X _ X
		for (i = 1; i <= 5; i++) { 				// X _ _ X
			for (sp = 4; sp >= c; sp--) { 		//X X X X X
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= i; j++) {
				if (i == 5 || j == 1 || i == j)
					System.out.print(" " + "X");
				else
					System.out.print(" " + "_");
			}
			System.out.println(" ");
		}

	}
}

class Test10 {
	public static void main(String[] args) { 	//    *
		int i, j, sp; 							// 	 ***
		int c = 1, a = 1, b = 1; 				// 	*****
		for (i = 1; i <= 5; i++) { 				// *******
			for (sp = 4; sp >= c; sp--) { 		//*********
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= a; j++) {
				System.out.print("*");
			}
			a = a + 2;
			System.out.println(" ");
		}
	}
}

class Test11 {
	public static void main(String[] args) { 	//    1
		int i, j, sp; 							//   123
		int c = 1, a = 1, b = 1; 				//  12345
		for (i = 1; i <= 5; i++) { 				// 1234567
			for (sp = 4; sp >= c; sp--) { 		//123456789
				System.out.print(" ");
			}
			c++;
			for (j = 1; j <= a; j++) {
				System.out.print(j);
			}
			a = a + 2;
			System.out.println(" ");
		}
	}
}

class Test12 {
	public static void main(String[] args) { 	//    A
		char i, j, sp; 							// 	 ABC
		char c = 'A', a = 'A', b = 'A'; 		//  ABCDE
		for (i = 'A'; i <= 'E'; i++) { 			// ABCDEFG
			for (sp = 'D'; sp >= c; sp--) { 	//ABCDEFGHI
				System.out.print(" ");
			}
			c++;
			for (j = 'A'; j <= a; j++) {
				System.out.print(j);
			}
			a = (char) (a + 2);
			System.out.println(" ");
		}
	}
}
