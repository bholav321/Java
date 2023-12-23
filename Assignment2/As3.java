//How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?

class Test{
  public static void main(String[] args){
	int tiles,rectangle;
	int length = 13;
	int breadth = 7;
	int rl = 520;
	int rb = 140;
	tiles = length*breadth;
	rectangle = rl*rb;
	int Totaltiles;
	Totaltiles = rectangle/tiles;
	System.out.println("Totaltiles = "+Totaltiles);
	

  }

}