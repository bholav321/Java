//Write a proram to input the marks of 5 subject of student. then calculate the percentage. if percentage is greater then 60 print you are passed with 1st divistion , if percetnage is between 50 to 59 then print 2nd division, if percentage is between 33 to 49 then print 3rd division otherwise failed. You have print the marksheet with proper formate with total marks obtained and division.
import java.util.Scanner;

class Test{
  public static void main(String[] args){
	//float m = 65f;
	//float sc = 75f;
	//float s = 79f;
	//float h = 80f;
	//float e = 86f;
	Scanner sc = new Scanner(System.in);
	int m,sci,s,h,e;
	System.out.println("Enter 1st no... ");
	m = sc.nextInt();
	System.out.println("Enter 2nd no... ");
	sci = sc.nextInt();
	System.out.println("Enter 3th no... ");
	s = sc.nextInt();
	System.out.println("Enter 4th no... ");
	h = sc.nextInt();
	System.out.println("Enter 5th no... ");
	e = sc.nextInt();
	

	float n;
	n = ((m+sci+s+h+e)/5);
	System.out.println("math    = "+m);
	System.out.println("science = "+sci);
	System.out.println("social  = "+s);
	System.out.println("hindi   = "+h);
	System.out.println("english = "+e);
	System.out.println("Percentage = "+n+"%");
	String max = (n>=60) ? ("First Division") : (n>=50) ? ("Second Division") : (n>=33) ? ("Third Divison") : ("Failed");
	
	System.out.println(max);
	

  }

}