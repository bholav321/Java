import java.util.Scanner;

public class Que3 {
    public void divide(){
        int sum=0;
        for(int i=100; i<=200; i++){
            if(i%7==0){
                System.out.print("number which is divisible by 7 : "+i);
                sum = sum+i;
            }
        }
        System.out.println("Sum of all integer greater than 100 and less than 200 are divisible by 7");
        System.out.println(sum);
    }
}

class Test{
    public static void main(String[] args) {
        Que3 obj = new Que3();
        obj.divide();
    }
}