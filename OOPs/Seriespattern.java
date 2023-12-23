//29) 1	11	111	1111	  11111	……

public class Seriespattern {
    public void pattern1(){
        int n=6;
        int sum =0;
        System.out.print("Series Pattern : ");
        for(int i=1; i<=n; i++){
            sum = sum*10+1;
            System.out.print(" "+sum);
        }
    }  
}
class Testmain{
    public static void main(String[] args){
        Seriespattern obj = new Seriespattern();
        obj.pattern1();
    }
}
