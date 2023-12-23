//23) 1	9	25	49	81	…..

import java.util.Scanner;

public class Oddsquare {
    public void oddsquare1(int n){
        System.out.print("Square = ");
        for(int i=1; i<=n; i++){
            if(i%2==1){
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
        Oddsquare obj = new Oddsquare();
        obj.oddsquare1(n);
    }
}

