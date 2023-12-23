//If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.

class Test{
  public static void main(String[] args){
	int length = 20;
	int cost = 1600;
	int area,breadth;
	breadth = cost/25;
	area = length*breadth;
	int perimeter;
	perimeter = (2*length) + (2*breadth);
	System.out.println("Breadth = "+breadth);
	System.out.println("Area = "+area);
	System.out.println("Perimeter = "+perimeter);
	
	
	
  }


}

