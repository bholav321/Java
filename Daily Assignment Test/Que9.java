import java.util.Scanner;

public class Que9 {
    public void positivenegative(int num){
        if(num<0){
            System.out.println("Number is negative ");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        Que9 obj = new Que9();
        obj.positivenegative(num);
    }
}
