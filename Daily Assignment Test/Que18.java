import java.util.Scanner;

public class Que18 {
    public void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int num = sc.nextInt();
        Que18 obj = new Que18();
        obj.pattern(num);
    }
}
