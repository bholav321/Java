//47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
public class Tablebw2number {
    public void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        for(int i=num1; i<=num2; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
    }
}
class Test{
    public static void main(String[] args){
        Tablebw2number obj = new Tablebw2number();
        obj.table();
    }
}
