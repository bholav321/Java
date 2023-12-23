//27) *  	#	*	#	*	#	*	#	*	…….

public class hashstar {
  public void pattern(){
    int n = 10;
    for(int i=0; i<=n; i++){
        if(i%2==0){
            System.out.print(" "+"*");
        }
        else{
            System.out.print(" "+"#");
        }
    }
  }  
}
class Testmain{
    public static void main(String[] args){
        hashstar obj = new hashstar();
        obj.pattern();
    }
}
