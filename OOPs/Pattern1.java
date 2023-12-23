public class Pattern1 {
    public void pattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args){
        Pattern1 obj = new Pattern1();
        obj.pattern();
    }
}
