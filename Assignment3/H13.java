//13) WAP to print N natural numbers in reverse order

import java.util.Scanner; 
    
    public class H13 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            for(int i=num; i>=1; i--){
                System.out.println(i);
            }
        }
    }
