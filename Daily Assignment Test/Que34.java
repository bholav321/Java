import java.util.Scanner;

public class Que34 {
    private String s1;
    public void setdata(String s1){
        this.s1 = s1;
    }
    public void uppercase(){
        String s2[] = s1.split(" ");
        for(int i=0; i<s2.length; i++){
            char ch[] = s2[i].toCharArray();
            for(int j=0; j<ch.length; j++){
                if(j==0){

                    if(ch[0]>=97 && ch[0]<=122){
                        System.out.print((char)(ch[0]-32));
                    }
                }
                else{
                    System.out.print((char)ch[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
class Testmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s1 = sc.nextLine();
        Que34 obj = new Que34();
        obj.setdata(s1);
        obj.uppercase();

    }
}
