//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
public class Series2 {
    public void series1(int n){
        int sum = 1;
        for(int i=0; i<=n; i++){
            System.out.println(sum);
            sum = sum+i;
        }
    }
    
}

class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        Series2 obj = new Series2();
        obj.series1(n);
    } 
}