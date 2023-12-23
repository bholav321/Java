//WAP to find the leap year.
class Test{
  public static void main(String[] args){
	int a = 2000;
	String y = (a%4==0 && a%100!=0 && a%400==0)? ("Leap year") : ("Not a leap year");
	System.out.println(y);
	


  }


}