class Test{
  public static void main(String[] args){
	char i = 'A';
	char n = 'Z';
	for (i = 'A'; i<='Z'; i++){
	if (i%2==1)
	System.out.println(i);
	else
	System.out.println((char)(i+32));
	}

  }

}