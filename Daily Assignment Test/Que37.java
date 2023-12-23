import java.util.Scanner;

class Magical{
    private int num;
    public Magical(int num){
        this.num = num;
    }
    public void Mg(int num){
        int sum=0;
        int sum1=0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        while(sum!=0){
            int digit1 = sum%10;
            sum1 = sum1+digit1;
            sum =sum/10;
        }
        if(sum1==1){
            System.out.println("Magical Number");
        }
        else{
            System.out.println("Not Magical Number");
        }
    }
        
      
    
}
class Test{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        Magical obj = new Magical(num);
        obj.Mg(num);
    }
}