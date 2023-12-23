//24) 0	4	16	36	64	....

import java.util.Scanner;

public class H24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int series;
        for(int i=0; i<=num; i++){
            if(num%2==0){
                series = i*i;
                System.out.println(series);
            }
        }
    }
}

