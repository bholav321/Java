//40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
public class Evenoddcount {
    public void evenodd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int ecount=0,ocount=0;
        while(num!=0){
            int digit = num%10;
            num = num/10;
            if(digit%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("Even Count : "+ecount);
        System.out.println("Odd Count : "+ocount);
    }
    
}
class Testmain{
    public static void main(String[] args){
        Evenoddcount obj = new Evenoddcount();
        obj.evenodd();
    }
}
