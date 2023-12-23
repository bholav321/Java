//22) 1	8	27	64	125	…..

import java.util.Scanner;

public class Cube {
    public void cube1(int n){
        System.out.print("Square = ");
        for(int i=1; i<=n; i++){
            System.out.print(" "+i*i*i);
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Cube obj = new Cube();
        obj.cube1(n);
    }
}

