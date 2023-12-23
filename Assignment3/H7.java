//7) WAP to check whether entered number is prime or not.

import java.util.Scanner;

class H7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime = "+num);
        }
        else{
            System.out.println("Number is not prime = "+num);
        }
    }
}
