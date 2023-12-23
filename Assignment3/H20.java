//20) 0	7	14	21	28	35	…..
import java.util.Scanner;
public class H20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int series;
        for(int i=0; i<=num; i++){
            series = 7*i;
            System.out.println(series);
        }
    }  
}
