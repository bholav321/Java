import java.util.Scanner;

public class Que5 {
    public void voting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for votting");
        }
        else{
            System.out.println("You are not eligible for votting");
        }

    }
}
class Test{
    public static void main(String[] args) {
        Que5 obj = new Que5();
        obj.voting();
    }
}