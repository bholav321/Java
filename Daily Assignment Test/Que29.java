import java.util.Scanner;
public class Que29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s1 = sc.next();
        char ch[] = s1.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]+" ");
        }
    }
}
