import java.util.Scanner;

public class Neven{
    public void even(int n){
        System.out.print("Even number : ");
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number");
        int n = sc.nextInt();
        Neven obj = new Neven();
        obj.even(n);

    }
}