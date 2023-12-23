//8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m²

class Test{
  public static void main(String[] args){
	float height,area;
	height = 20f;
	area = 0.8f*100;
	//height = 20f/100;
	float base;
	base = (2*area)/height;
	System.out.println("Base of a triangle ="+base);
  }

}