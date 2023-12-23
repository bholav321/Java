//14) WAP to print alphabets in uppercase

public class Uppercase {
    public void alphabets(){
        System.out.print("Alphabets : ");
        for(char i='A'; i<='Z'; i++){
            System.out.print(" "+i);
        }
    }   
}
class Testmain{
    public static void main(String[] args){
        Uppercase obj = new Uppercase();
        obj.alphabets();
    }
}
