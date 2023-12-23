
import java.util.Scanner;
public class Que28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String s1 = sc.next();
        System.out.println("Enter 2nd String ");
        String s2 = sc.next();
        char ch[]  = s1.toCharArray();
        char c[] = s2.toCharArray();
        boolean flag = false;
        if(ch.length==c.length){
            for(int i=0; i<ch.length; i++){
                flag = false;
                for(int j=0; j<ch.length; j++){
                    if(ch[i]==c[j]){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("It is anagram ");
            }
            else{
                System.out.println("It is not anagram");
            }
        }
        
    }
}
