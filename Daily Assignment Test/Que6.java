import java.util.Scanner;

public class Que6 {
    public void greater(int num1, int num2, int num3){
        if(num1>=20 && num1<num2 && num1<num3){
            System.out.println("First : "+num1);
        }
        else if(num2>=20 && num2<num1 && num2<num3){
            System.out.println("Second : "+num2);
        }
        else{
            System.out.println("Third : "+num3);
        }
    }

}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int num3 = sc.nextInt();
        
        Que6 obj = new Que6();
        obj.greater(num1,num2,num3);



    }
}
