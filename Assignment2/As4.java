//Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.

class Test{
  public static void main(String[] args){
	int area;
	int l,b;
	l = 300;
	b = 150;
	area = l*b;
	int rate;
	rate = (area*6)/100;
	System.out.println("Rate of plot = "+rate);

	
  }

}

