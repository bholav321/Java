public class Pattern4 {
    
    public void pattern3(){
        for(char i='A'; i<='E'; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args){
        Pattern4 obj = new Pattern4();
        obj.pattern3();
    }
}
