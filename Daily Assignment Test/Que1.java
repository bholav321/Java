// The final Salary computed after the addition of DA,HRA and other allowances. The formula for gross salary is defind as belows.
// Gross salary = basic+HRA+DA+Allow-PF.
// Here, HRA = 20% of basic DA = 50% of Basic 
// Allow = 1700 if grade 'A'.
// Allow = 1500 if grade 'B'.
// Allow = 1300 if grade 'C'.
// PF = 11% of basic.
import java.util.Scanner;

public class Que1{
    public void Grosssalary(int basic){
        Scanner sc = new Scanner(System.in);
        int hra = (basic/100)*20;
        int da = (basic/100)*50;
        int allow = 0;
        System.out.println("Enter grade  ");
        char grade = sc.next().charAt(0);
        if(grade=='A'){
            allow = 1700;
        }
        if(grade=='B'){
            allow = 1500;
        }
        if(grade=='C'){
            allow = 1300;
        }
        int pf = (basic/100)*11;
        int grosssalary;
        System.out.println("Basic salary of employee is : "+basic);
        System.out.println("HRA of basic salary is : "+hra);
        System.out.println("DA of basic salary is : "+da);
        System.out.println("Allow of this salary is : "+allow);
        System.out.println("Prohibited fund of basic salary is : "+pf);
        grosssalary = basic+hra+da+allow-pf;
        System.out.println("Gross salary of Employee is : "+grosssalary);

    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic salary of Employee ");
        int basic = sc.nextInt();
        Que1 obj = new Que1();
        obj.Grosssalary( basic);
    }
}