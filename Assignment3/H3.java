import java.util.Scanner;
class H3{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int a=0;
        System.out.println("Enter number ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            a = a + i;
        }
        System.out.println("Sum of N natural number : "+a);
    }
    
}
