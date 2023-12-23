// WAP to find lowest number among four different number

class Test{
  public static void main(String[] args){
	int a,b,c,d;
	a = 5;
	b = 6;
	c = 7;
	d = 8;
	if (a<b && a<c && a<d)
	System.out.println("a is lowest number");
	else if(b<a && b<c && b<d)
	System.out.println("b is lowest number");
	else if (c<a && c<b && c<d)
	System.out.println("c is lowest number");
	else 
	System.out.println("d is lowest number");

  }

}