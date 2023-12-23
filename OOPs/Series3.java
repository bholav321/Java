//18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner; 

public class Series3 {
    public void series2(int n){
        int pro=1,c=2,b=1;
        System.out.print(" "+b);
        System.out.print(" "+c);
        for(int i=0; i<=n; i++){
            pro = b*c;
            System.out.print(" "+pro);
            b = c;
            c = pro;
        }
    }    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        Series3 obj = new Series3();
        obj.series2(n);
    }
}
