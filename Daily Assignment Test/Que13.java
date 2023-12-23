import java.util.Scanner;

public class Que13 {
    public void celcius(double fah){
        double cel = (fah-32)*5/9;
        System.out.println("Celcius : "+cel);
    }
    
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrehit value : ");
        double fah = sc.nextInt();
        Que13 obj = new Que13();
        obj.celcius(fah);
    }
}
