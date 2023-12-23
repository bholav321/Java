import java.util.Scanner;

public class Que16 {
    public void unit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit : ");
        int unit = sc.nextInt();
        int bill;
        if(unit<100 && unit>0){
            bill = unit*10;
        }
        else if(unit<200){
            bill = unit*15;
        }
        else if(unit<300){
            bill = unit*20;
        }
        else{
            bill = unit*30;
        }

        System.out.println("Total bill : "+bill);
    }
}
class Test{
    public static void main(String[] args) {
        Que16 obj = new Que16();
        obj.unit();
    }
}