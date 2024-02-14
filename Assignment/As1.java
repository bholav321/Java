//The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.

//area of perameter = 2l+b

class Test{
  public static void main(String[] args){
	int perimeter = 230;
	int length = 70;
	int breadth;
	breadth = perimeter-(2*length)/2;
	System.out.println("Breadth of rectangle is ="+breadth);
	
  }

}
