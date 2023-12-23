//Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.


class Test{
  public static void main(String[] args){
	int side1,side2;
	side1 = 10;
	side2 = 9;
	int b,perimeter; 
	perimeter = 36;
	b = perimeter-side1-(side2);
	int h;
	int area;
	h = 10;
	area = (b*h)/2;
	System.out.println(area);
	
	
  }
}
