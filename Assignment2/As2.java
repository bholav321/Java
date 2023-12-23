//The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.

class Test{
  public static void main(String[] args){
	int area = 96;
	int breadth = 8;
	int length,perimeter;
	length = area/breadth;
	perimeter = (2*length)+(2*breadth);
	System.out.println("length = "+length);
	System.out.println("perimeter ="+perimeter);
	
  }

}
