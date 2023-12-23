//43) WAP to convert binary number into decimal number
import java.util.Scanner;

import javax.naming.Binding; 
public class Binary {
    public void binary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary digit");
        int num = sc.nextInt();
        int sum=0,pow=1,rev=0;
        int count=0;
        while(num>0){
            rev = num%10;
            num = num/10;
            count++;
            
        }
        for(int j=1; j<count; j++){
            pow = pow*2;
        }
       
        if(rev==1){
            sum = sum+pow;
            pow=1;
        }
        System.out.println(sum);
    }
    
}
class Testmain{
    public static void main(String[] args){
        Binary obj = new Binary();
        obj.binary();
    }
}