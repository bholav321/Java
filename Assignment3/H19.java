//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)

import java.util.Scanner;

class H19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number of series : ");
        int num = sc.nextInt();
        float a=0,b=1,c;
        float sum = 0;
        for(int i=1; i<=num; i++){
            a = a+b;
            c = 1/a;
            System.out.println("Sum = "+c);
            sum = sum+c;
        }
        System.out.println("Sum = "+sum);
    }
}