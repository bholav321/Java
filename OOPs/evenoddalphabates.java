//32) A	b	C	d	E	f	G	h	…… n terms 

public class evenoddalphabates {
    public void alphabat(){
        int n = 10;
        char a = 'A';
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.print(" "+a);
                
            }
            else{
                System.out.print(" "+(char)(a+32));
            }
            a++;
        }
    }    
}
class Testmain{
    public static void main(String[] args){
        evenoddalphabates obj = new evenoddalphabates();
        obj.alphabat();
    }
}