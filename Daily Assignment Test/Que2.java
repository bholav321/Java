// WAP to check if sales of a person is greater than 10000 then eligible for bonus as 20% of sales.

// import java.util.Scanner;

// public class Que2{
//     public void Bonus(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a salary of a person is : ");
//         int sales = sc.nextInt();
//         int bonus;
//         if(sales>10000){
//             bonus = (sales/100)*20;
//         }
//         else{
//             bonus = 0;
//         }
//         System.out.println("Bonus is : "+bonus);
//     }
// }
// class Test{
//     public static void main(String[] args){
//         Que2 obj = new Que2();
//         obj.Bonus();
//     }
// }
import java.util.Scanner;

public class Que2{
    public int Bonus(int sales){
       
        int bonus;
        if(sales>10000){
            bonus = (sales/100)*20;
        }
        else{
            bonus = 0;
        }
        // System.out.println("Bonus is : "+bonus);
        return bonus;
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a salary of a person is : ");
        int sales = sc.nextInt();
        Que2 obj = new Que2();
        System.out.println("Bonus : "+obj.Bonus(sales));
    }
}