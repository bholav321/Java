class Test {
	public static void main(String[] args) { 		// 1
		int i, j; 									// 123
		for (i = 1; i <= 5; i++) { 					// 12345
			for (j = 1; j < i * 2; j++) { 			// 1234567
				System.out.print(j); 				// 123456789
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		// 1
		int i, j; 									// 222
		for (i = 1; i <= 5; i++) { 					// 33333
			for (j = 1; j < i * 2; j++) { 			// 4444444
				System.out.print(i); 				// 555555555
			}
			System.out.println(" ");
		}
	}
}

class Test2 {
	public static void main(String[] args) { 		// *****
		int i, j; 									// ****
		for (i = 1; i <= 5; i++) { 					// ***
			for (j = 5; j >= i; j--) { 				// **
				System.out.print("*"); 				// *
			}
			System.out.println(" ");
		}
	}
}

class Test3 {
	public static void main(String[] args) { 		// 12345
		int i, j; 									// 1234
		for (i = 5; i>= 1; i--) { 					// 123
			for (j = 1; j <= i; j++) { 				// 12
				System.out.print(j); 				// 1
			}
			System.out.println(" ");
		}
	}
}

class Test4 {
	public static void main(String[] args) { 		// 55555
		int i, j; 									// 4444
		for (i = 5; i <= 5 && i >= 1; i--) { 		// 333
			for (j = 1; j <= i; j++) { 				// 22
				System.out.print(i); 				// 1
			}
			System.out.println(" ");
		}
	}
}

class Test5 {
	public static void main(String[] args) { 		// ABCDE
		char i, j; 									// ABCD
		for (i = 'E'; i>='A'; i--) { 				// ABC
			for (j = 'A'; j <= i; j++) { 			// AB
				System.out.print(j); 				// A
			}
			System.out.println(" ");
		}
	}
}

class Test6 {
	public static void main(String[] args) { 		// EEEEE
		char i, j; 									// DDDD
		for (i = 'E'; i <= 'E' && i >= 'A'; i--) { 	// CCC
			for (j = 'A'; j <= i; j++) { 			// BB
				System.out.print(i); 				// A
			}
			System.out.println(" ");
		}
	}
}
