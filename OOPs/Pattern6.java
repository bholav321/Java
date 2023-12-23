public class Pattern6 {
    public void pattern5(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}
class Test{
    public static void main(String[] args){
        Pattern6 obj = new Pattern6();
        obj.pattern5();
    }
}