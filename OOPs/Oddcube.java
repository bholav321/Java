//25) 1	27	125	343	…………

import java.util.Scanner;

public class Oddcube {
    public void oddcube1(int n){
        System.out.print("Square = ");
        for(int i=1; i<=n; i++){
            if(i%2==1){
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
        Oddcube obj = new Oddcube();
        obj.oddcube1(n);
    }
}
