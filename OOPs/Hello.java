//28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….

public class Hello {
    public void Hello1(){
        int n=10;
        for(int i=1; i<=n; i++){
            if(i%5==0){
                System.out.print(" "+"Hello");
            }
            else{
                System.out.print(" "+i);
            }
        }
    }
}

class Testmain{
    public static void main(String[] args){
        Hello obj = new Hello();
        obj.Hello1();
    }
}