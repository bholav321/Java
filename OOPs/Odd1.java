import java.util.Scanner;

public class Odd1 {
    public void odd12(int n){
        System.out.print("Odd number : ");
        for(int i=n; i>=0; i--){
            if(i%2==1){
                System.out.print(" "+i);
            }
        }
    }
}

class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Odd1 obj = new Odd1();
        obj.odd12(n);
    }
}

