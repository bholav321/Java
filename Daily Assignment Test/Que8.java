import java.util.Scanner;

public class Que8 {
    public void Ascii(char c){
        System.out.println((int)c);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = sc.next().charAt(0);
        Que8 obj = new Que8();
        obj.Ascii(c);
    }
}