//15) WAP to print alphabets in lowercase

public class Lowercase {
    public void loweralphabates(){
        System.out.print("Lowercase Alphabates :");
        for(char i='a'; i<='z'; i++){
            System.out.print(" "+i);
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Lowercase obj = new Lowercase();
        obj.loweralphabates();
    }
}
