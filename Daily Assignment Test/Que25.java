public class Que25 {
    public void pattern1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
class Testmain{
    public static void main(String[] args) {
        Que25 obj = new Que25();
        obj.pattern1();
    }
}