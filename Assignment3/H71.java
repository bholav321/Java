class Test {
	public static void main(String[] args) { 	//     1
		int i, j, sp, c = 1; 					//    12
		for (i = 1; i <= 5; i++) { 				//   123
			for (sp = 4; sp >= c; sp--) { 		//  1234
				System.out.print(" "); 		// 12345
			}
			c++;
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 	//     A
		int sp, c = 1; 							//    AB
		char i, j; 								//   ABC
		for (i = 'A'; i <= 'E'; i++) { 			//  ABCD
			for (sp = 4; sp >= c; sp--) { 		// ABCDE
				System.out.print(" ");
			}
			c++;
			for (j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 	//     1
		int sp;									//    11
		int i, j; 								//   1*1
		for (i = 1; i <= 5; i++) { 				//  1**1
			for (sp = 4; sp >= i; sp--) { 		// 11111
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				if (i == 5 || j == 1 || j == i)
					System.out.print("1");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 	//     A
		int sp, c = 1; 							//    AB
		char i, j; 								//   A_C
		for (i = 'A'; i <= 'E'; i++) { 			//  A__D
			for (sp = 4; sp >= c; sp--) { 		// ABCDE
				System.out.print(" ");
			}
			c++;
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

class Test4 {
	public static void main(String[] args) { 			//     1
		int i, j; 										//    10
		int sp; 										//   101
		for (i = 1; i <= 5; i++) { 						//  1010
			for (sp = 4; sp >= i; sp--) { 				// 10101
				System.out.print(" ");
			}
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
