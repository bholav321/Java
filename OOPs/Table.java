//20) 0	7	14	21	28	35	…..

import java.util.Scanner;
public class Table {
    public void table7(int n){
        System.out.print("Table Series : ");
        for(int i=0; i<=n; i++){
            System.out.print(" "+i*7);
        }
    }    
}
class Testmain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Table obj = new Table();
        obj.table7(n);

    }
}
