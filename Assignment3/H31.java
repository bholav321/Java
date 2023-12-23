//31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
public class H31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=1;
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            sum = sum*10;
            int c = sum-1;
            System.out.println(c);
        }
    }
}
