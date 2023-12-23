	//There are two arrays object one containing 100 elements and another
	//containing 50 elements. Both are of same data type. Can we assign one Array to
	//another Array

	class Test {
		public static void main(String[] args) {
			int a[] = new int[50];
			int b[] = new int[100];
			a = b;
			System.out.println(a.length);
		}

	}