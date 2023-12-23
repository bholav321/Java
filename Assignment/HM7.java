/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int ch,ca;
	System.out.println("No. of classes held");
	ch = sc.nextInt();
	System.out.println("No. of classes attendance");
	ca = sc.nextInt();
	int percentage = ((ca*100)/ch);
	System.out.println(percentage);
	if (percentage<75)
	System.out.println("Student is not allow");
	else{
	System.out.println("Student is allow for sit in exam hall");
	}

  }
}

