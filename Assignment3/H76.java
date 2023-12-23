class Test{
   public static void main(String[] args){		//X
	int i,j;									//XX
	for(i=1; i<=4; i++){						//XXX
		for(j=1; j<=i; j++){					//XXXX
			System.out.print("X");			//XXX
		}										//XX
		System.out.println(" ");				//X
	}
		for(i=1; i<=3; i++){
			for(j=3; j>=i; j--){
				System.out.print("X");
			}
			System.out.println(" ");
		}
  }
}