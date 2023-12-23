//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
public class Perfect {
    public void perfectno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum =0;
        int c = num;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(c==sum){
            System.out.println(c+"is a perfect number");
        }
        else{
            System.out.println(c+"is not a perfect number");
        }
    }
}

class Test{
    public static void main(String[] args){
        Perfect obj = new Perfect();
        obj.perfectno();
    }
}