class Test {
	public static void main(String[] args) { // 123456789
		int i, j, sp; 						 //  1     7
		for (i = 9; i >= 1; i -= 2) { 		 //   1   5
			for (sp = 9; sp >= i; sp -= 2) { //    1 3
				System.out.print(" "); 	 //     1
			}
			for (j = 1; j <= i; j++) {
				if (i == 9 || j == i || j == 1)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}

class Test1 {
	public static void main(String[] args) { 		//123456789
		int i, j, sp; 								// 1+++++7
		for (i = 9; i >= 1; i -= 2) { 				//  1+++5
			for (sp = 9; sp >= i; sp -= 2) { 		//   1+3
				System.out.print(" "); 			//    1
			}
			for (j = 1; j <= i; j++) {
				if (i == 9 || j == i || j == 1)
					System.out.print(j);
				else
					System.out.print("+");
			}
			System.out.println(" ");
		}
	}
}
