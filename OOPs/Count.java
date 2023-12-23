//35) WAP to count number of digits
import java.util.Scanner;
public class Count {
    public int number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            int digit = n%10;
            n = n/10;
            sum = sum+digit;
        }
        return sum;
    }
}
class Testmain{
    public static void main(String[] args){
        Count obj = new Count();
        int result = obj.number();
        System.out.println(result);
    }
}