class Test {
	public static void main(String[] args) { 	// * * * * *
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.print("*");
		}
	}

}

class Test1 {
	public static void main(String[] args) { 	// *
		int i; 									// *
		for (i = 1; i <= 5; i++) { 				// *
			System.out.println("*"); 			// *
		} 										// *
	}

}

class Test2 { 									// * * * * *
	public static void main(String[] args) { 	// * * * * *
		int i, j; 								// * * * * *
		for (i = 1; i <= 5; i++) { 				// * * * * *
			for (j = 1; j <= 5; j++) { 			// * * * * *
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}

class Test3 { 									// 12345
	public static void main(String[] args) { 	// 12345
		int i, j; 								// 12345
		for (i = 1; i <= 5; i++) { 				// 12345
			for (j = 1; j <= 5; j++) { 			// 12345
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}

class Test4 { 									// 11111
	public static void main(String[] args) { 	// 22222
		int i, j; 								// 33333
		for (i = 1; i <= 5; i++) { 				// 44444
			for (j = 1; j <= 5; j++) { 			// 55555
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
