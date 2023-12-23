import java.util.Scanner;

    class Test {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            for(int i=1; i<=num; i++){
                if(num%2==1){
                    System.out.println("Odd number = "+num);
                }
            }
        }
}
