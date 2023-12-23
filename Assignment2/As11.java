//The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.

class Test{
  public static void main(String[] args){
	int area;
	area = 320;
	int base,height,a;
	a = ((2*area)/(8*5));
	a = a/4;
	base = 8*a;
	height = 5*a;
	System.out.println("Base of triangle = "+base);
	System.out.println("Height of triangle = "+height);
	
	
	
  }

}

