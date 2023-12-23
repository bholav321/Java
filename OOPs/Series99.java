//31) 9	99	999	9999	  99999 …….

public class Series99 {
    public void pattern99(){
        int n = 5; 
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum = sum*10;
            int c = sum-1;
            System.out.print(" "+c);
        }
    }
}
class Testmain{
    public static void main(String[] args){
        Series99 obj = new Series99();
        obj.pattern99();
    }
}