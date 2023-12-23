//16) …... -6	-3	0	3	6	9	……. n terms

import java.util.Scanner;
public class Series1 {
    public void series(int n){
        int a,c=n;
        System.out.print("Series : ");
        for(int i=1; i<=n*2; i++,c--){
             a = 3*(-c);
            System.out.print(a);
        }
    }
    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        Series1 obj = new Series1();
        obj.series(n);
    }
}