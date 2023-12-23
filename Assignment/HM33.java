//Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
//Basic Salary <= 20000 : HRA = 25%, DA = 90% 
//Basic Salary > 20000 : HRA = 30%, DA = 95% 

import java.util.Scanner;

class Test{
  public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	int salary;
	System.out.println("Enter your basic salary");
	salary = sc.nextInt();
	int HRA,DA;
	if (salary<=10000){
	HRA = (salary*20)/100;
	DA = (salary*80)/100;
	}
	else if (salary<=20000){
	HRA = ((salary*25)/100);
	DA = ((salary*90)/100);
	}
	else{
	HRA = ((salary*30)/100);
	DA = ((salary*95)/100);
	}
	System.out.println("HRA="+HRA);
	System.out.println("DA = "+DA);
	int Gross;
	Gross = (salary+HRA+DA);
	System.out.println("Gross salary = "+Gross);
  }

}