//13) WAP to print N natural numbers in reverse order
import java.util.Scanner;
public class Reverse {
    public void reversenumber(int n){
        System.out.print("Reverse Number : ");
        for(int i=n; i>=0; i--){
            System.out.print(" "+i);
        }
    }    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        Reverse obj = new Reverse();
        obj.reversenumber(n);
    }
}