//25) 1	27	125	343	…………	

import java.util.Scanner;

public class H25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2==1){
                System.out.println("Series = "+i*i*i);
            }
        }

    }
}
