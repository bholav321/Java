public class Que15 {
    public void prime(){
        int count=0;
        for(int i=1; i<100; i++){
            count=0;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }

    }    
}
class Test{
    public static void main(String[] args) {
        Que15 obj = new Que15();
        obj.prime();
    }
}