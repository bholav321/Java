//22) 1	8	27	64	125	
import java.util.Scanner;
public class H22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int cube;
        for(int i=1; i<=num; i++){
            cube = i*i*i;
            System.out.println(cube);
        }
    }  
}
