//17) 1 	2	 4	 7	 11	 16 	…… n terms

import java.util.Scanner;

public class H17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number series : ");
        int num = sc.nextInt();
        int a=1,b=1;
        for(int i=1; i<=6; i++){
            System.out.println(a);
            a = a+b;
            b++;
        }
    }
    
}
