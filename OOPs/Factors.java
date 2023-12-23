//6) WAP to find out the factors of a number.
import java.util.Scanner;
public class Factors {
    public void factor(int a){
        for(int i=1; i<=a; i++){
            if(a%i==0){
                System.out.println("Factor is "+i);
            }
        }
    }  
}

class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Factors obj = new Factors();
        System.out.println("Enter a number");
        int a = sc.nextInt();
        obj.factor(a);
    }
}
