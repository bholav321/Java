//48) WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
public class Factorbw2number {
    public void factor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num1 = sc.nextInt();
        System.out.println("Enter number");
        int num2 = sc.nextInt();
        for(int i=num1; i<=num2; i++){
            for(int j=1; j<i; j++){
                if(i%j==0){
                    System.out.println("Factor of "+i+" is "+j);
                }
            }
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Factorbw2number obj = new Factorbw2number();
        obj.factor();
    }
}
