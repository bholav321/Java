public class Printnumber {
    public void Number(int a){
        for(int i=0; i<=a; i++){
            System.out.println(i);
        }
        
    }
}
class Testmain{
    public static void main(String[] args){
        Printnumber obj = new Printnumber();
        obj.Number(100);
       
    }
}
