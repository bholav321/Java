//21) 1,	4,	9,	16,	25	…..

import java.util.Scanner;
public class Square {
    public void square2(int n){
        System.out.print("Square = ");
        for(int i=1; i<=n; i++){
            System.out.print(" "+i*i);
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Square obj = new Square();
        obj.square2(n);
    }
}