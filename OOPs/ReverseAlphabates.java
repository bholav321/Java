//33) WAP to print Alphabets in reversing order.

public class ReverseAlphabates {
    public void reversealphabates(){
        System.out.print("Reverse Alphabates : ");
        for(char i='z'; i>='a'; i--){
            System.out.print(" "+i);
        }
    }
}
class Testmain{
    public static void main(String[] args){
        ReverseAlphabates obj = new ReverseAlphabates();
        obj.reversealphabates();
    }
}
