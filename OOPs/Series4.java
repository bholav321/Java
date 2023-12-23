//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)

import java.util.Scanner;
public class Series4 {
    public void series3(int n){
        float a=0,b=1,c=0;
        float sum = 0;
        System.out.print("Series Sum = ");
        for(int i=1; i<=n; i++){
            a = a+b;
            c = 1/a;
            sum = sum+c;
            
        }
        System.out.println(sum);
    }
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Series4 obj = new Series4();
        obj.series3(n);
    }
}
