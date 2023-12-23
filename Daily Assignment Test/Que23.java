public class Que23 {
    public void pattern(){
        for(char i = 'D'; i>='A'; i--){
            for(char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Que23 obj =  new Que23();
        obj.pattern();
    }
}