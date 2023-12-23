//39) WAP to check whether entered number is strong or not
import java.util.Scanner;
public class Strong {
    public void strong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum =0;
        int c = num;
        while(num!=0){
            int digit = num%10;
            num = num/10;
            int fact = 1;
            for(int i=1; i<=digit; i++){
                fact = fact*i;
            }
            sum = sum+fact;

        }
        if(c==sum){
            System.out.println(sum+" is a stron number ");
        }
        else{
            System.out.println(sum+" is not a strong number ");
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Strong obj = new Strong();
        obj.strong();
    }
}
