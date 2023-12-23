//23) 1	9	25	49	81	…..
import java.util.Scanner;

public class H23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int series;
        for(int i=1; i<=num; i++){
            if(num%2==1){
                series = i*i;
                System.out.println(series);
            }
        }
    }
}
