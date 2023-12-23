//AP to print all the odd numbers between two entered numbers

import java.util.Scanner;
public class Oddbw2number {
    public void oddnumebr(int num1, int num2){
        for(int i=num1; i<=num2; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        Oddbw2number obj = new Oddbw2number();
        obj.oddnumebr(num1, num2);
    }
}