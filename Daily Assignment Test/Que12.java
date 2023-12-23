import java.util.Scanner;

public class Que12 {
    public void primenumber(int num){
        int count=0;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Que12 obj = new Que12();
        obj.primenumber(num);
    }
}