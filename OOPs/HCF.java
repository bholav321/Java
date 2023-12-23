//42) WAP to find out HCF of a number

import java.util.Scanner;

public class HCF{
    public void hcf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int HCF=0;
        int max = num1>num2 ? num1 : num2;
        for(int i=1; i<=max; i++){
            if(num1%i==0 && num2%i==0){
                 HCF = i;
            }
           
        }
        System.out.println("Highest Common Factor is "+HCF);

    }
}
class Test{
    public static void main(String[] args){
        HCF obj = new HCF();
        obj.hcf();
    }
}