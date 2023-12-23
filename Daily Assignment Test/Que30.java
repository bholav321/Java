import java.util.Scanner;

public class Que30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String ");
        String s1 = sc.next();
        System.out.println("Enter occurance character : ");
        char c = sc.next().charAt(0);
        char ch[] = s1.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++){
            if(c==ch[i]){
                count++;
            }
        }
        System.out.println(count);
       
    }
}
