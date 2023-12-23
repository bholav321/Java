import java.util.Scanner;

public class Que4 {
    public void alphabates(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char alphabates = sc.next().charAt(0);
        switch (alphabates){
        case 'a' : System.out.println(" It is a vowel "+alphabates);break;
        case 'e' : System.out.println(" It is a vowel "+alphabates);break;
        
        case 'i' : System.out.println(" It is a vowel "+alphabates);break;
        case 'o' : System.out.println(" It is a vowel "+alphabates);break;
        case 'u' : System.out.println(" It is a vowel "+alphabates);break;
        case 'A' : System.out.println(" It is a vowel "+alphabates);break;
        case 'E' : System.out.println(" It is a vowel "+alphabates);break;
        case 'I' : System.out.println(" It is a vowel "+alphabates);break;
        case 'O' : System.out.println(" It is a vowel "+alphabates);break;
        case 'U' : System.out.println(" It is a vowel "+alphabates);break;
        default : System.out.println("It is a consonant : "+alphabates);
    }

    }
}
class Test{
    public static void main(String[] args) {
        Que4 obj = new Que4();
        obj.alphabates();
    }
}