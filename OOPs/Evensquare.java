//24) 0	4	16	36	64	….. 

import java.util.Scanner;

public class Evensquare {
    public void evensquare1(int n){
        System.out.print("Square = ");
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.print(" "+i*i);
            }
            
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Evensquare obj = new Evensquare();
        obj.evensquare1(n);
    }
}


