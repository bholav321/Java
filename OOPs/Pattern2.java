public class Pattern2 {
    public void pattern1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args){
        Pattern2 obj = new Pattern2();
        obj.pattern1();
    }
}
