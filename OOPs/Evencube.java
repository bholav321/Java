//26) 0	8	64	216	…………

import java.util.Scanner;

public class Evencube {
    public void evencube1(int n){
        System.out.print("Square = ");
        for(int i=0; i<=n; i++){
            if(i%2==0){
                 System.out.print(" "+i*i*i);
            }
           
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Evencube obj = new Evencube();
        obj.evencube1(n);
    }
}
