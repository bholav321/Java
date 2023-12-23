import java.util.Scanner;

public class Que11 {
    public void Bill(int bill,int Pizza, int Puffs, int coldrinks, int a , int b, int c){
        bill = (Pizza*a) + (Puffs*b) + (coldrinks*c);
        System.out.println("Total Amount : "+bill);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pizza = 100;
        int Puffs = 20;
        int coldrinks = 10;
        System.out.println("How many number you want to order for pizza : ");
        int a = sc.nextInt();
        System.out.println("How many number you want to order for puffs : ");
        int b = sc.nextInt();
        System.out.println("How many number you want to order for coldrinks : ");
        int c = sc.nextInt();
        int bill=0;
        Que11 obj = new Que11();
        obj.Bill(bill, Pizza, Puffs, coldrinks, a,b,c);
    }
}