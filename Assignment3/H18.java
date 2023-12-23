//18) 1	2	2	4	8	32	…… n terms

import java.util.Scanner;

    public class H18 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int a=1,b=2;
            int c=1;
            System.out.println(a);
            System.out.println(b);
            for(int i=0; i<=num; i++){
                c = a*b;
                System.out.println(c);
                a=b;
                b=c; 
            }
        }
    }  
