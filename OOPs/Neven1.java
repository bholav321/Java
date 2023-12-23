//12) WAP to print even numbers upto N.

import java.util.Scanner;

public class Neven1 {
    public void evennumber(int n){
        System.out.print("Even number : ");
        for(int i=n; i>=0; i--){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number");
        int n = sc.nextInt();
        Neven1 obj = new Neven1();
        obj.evennumber(n);

    }
}

