
import java.util.Scanner;
public class H12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=num; i>=0; i--){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    
}
