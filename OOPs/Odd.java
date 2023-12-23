//11) WAP to print N odd numbers.

import java.util.Scanner;

public class Odd {
    public void odd(int n){
        System.out.print("Odd number : ");
        for(int i=0; i<=n; i++){
            if(i%2==1){
                System.out.print(" "+i);
            }
        }
    }
}

class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Odd obj = new Odd();
        obj.odd(n);
    }
}