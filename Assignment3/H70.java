class Test {
	public static void main(String[] args) { 		// A
		int i, j; 									// BCD
		char a = 'A'; 								// EFGHI
		for (i = 1; i <= 4; i++) { 					// JKLMNOP
			for (j = 1; j<i*2; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		// 54321
		int i, j; 									// 5432
		for (i = 1; i <= 5; i++) { 					// 543
			for (j = 5; j >= i; j--) { 				// 54
				System.out.print(j); 				// 5
			}
			System.out.println(" ");
		}
	} 
} 													//     1
													//    22
class Test2 { 										//   333
	public static void main(String[] args) { 		//  4444
		int i, j; 									// 55555
		for (i = 1; i <= 5; i++) {
			for(int sp=4; sp>=i; sp--){
				System.out.print(" ");
			}
			for (j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
} 
													//     5
class Test3 { 										//    44
	public static void main(String[] args) { 		//   333
		int i, j,a=1; 								//  2222
		for (i = 5; i>=1; i--) { 					// 11111
			for(int sp=4; sp>=a; sp--){
				System.out.print(" ");
			}a++;				
			for (j = 5; j>=i; j--){
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}													//    1
													//   12
class Test4 { 										//  123
	public static void main(String[] args) { 		// 1234
		int i, j; 									//12345
		for (i = 1; i <= 5; i++) {
			for(int sp=4; sp>=i; sp--){
				System.out.print(" ");
			}
			for (j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
} 