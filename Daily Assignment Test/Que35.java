import java.util.Scanner;

public class Que35 {
    private int num;
    public void setdata(int num){
        this.num = num;
    }
    public void spy(){
        int sum = 0;
        int pro = 1;
        while(num!=0){
            int digit = num%10;
            sum = digit+sum;
            pro = pro*digit;
            num = num/10;
        }
        if(sum==pro){
            System.out.println("It is spy number");
        }
        else{
            System.out.println("It is not spy number ");
        }
    }
}
class Testmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        Que35 obj = new Que35();
        obj.setdata(num);
        obj.spy();
    }
}