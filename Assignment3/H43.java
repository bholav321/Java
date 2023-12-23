import java.util.Scanner;

public class H43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0,pow=1,rev=0;
        int count = 0;
        System.out.println("Enter binary number : ");
        int num = sc.nextInt();
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
