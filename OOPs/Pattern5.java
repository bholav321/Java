public class Pattern5 {
    
    
    public void pattern4(){
        for(char i='a'; i<='e'; i++){
            for(char j='a'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args){
        Pattern5 obj = new Pattern5();
        obj.pattern4();
    }
}

