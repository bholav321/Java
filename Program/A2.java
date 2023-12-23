class Test{
  public static void main(String[] args){
	int a,b,c;
	a = 74;
	b = 50;
	c = 25;
	int x;
	x = (a>b) && (a>c) ? a : (b>a && b>c) ? b : c;
	System.out.println(x);	
	
  }

}