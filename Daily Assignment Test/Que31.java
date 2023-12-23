// import java.util.Scanner;

// public class Que31{
//     private String name;
//     private int salary,phone_no;
//     public Que31(String name, int salary , int phone_no){
//         this.name = name;
//         this.salary = salary;
//         this.phone_no = phone_no;
//     }
//     public Que31(){
        

//     }
//     public void display(){
        
//             System.out.println("Name of the employee : "+name);
//             System.out.println("Salary of the employee : "+salary);
//             System.out.println("Phone no. of the employee : "+phone_no);
//             System.out.println(" ");
        
//     }
// }

// class Testmain{
//     public static void main(String[] args) {
//         Scanner sc = new  Scanner(System.in);
//         System.out.println("How many employee");
//         int size = sc.nextInt();
//         Que31 obj = new Que31();
//         Que31 emp[] = new Que31[size];
//         for(int i=0; i<emp.length; i++){
//             System.out.println("Enter employee name : ");
//             String name = sc.next();
//             sc.nextLine();
//             System.out.println("Enter employee salary : ");
//             int salary = sc.nextInt();
//             System.out.println("Enter employee phone no. ");
//             int phone_no = sc.nextInt();
//             emp[i] = new Que31(name,salary,phone_no);
//         }
//         for(int i=0; i<emp.length; i++){
//             System.out.println(i+1);
//              emp[i].display();
//         }    
        
       
           
//     }
// }
// class This{
//     public This(){
//         this(100);
//         System.out.println("Default Constructor");
//     }
//     public This(int a){
//         this(50,40);
//         System.out.println("Int Constructor called");
//     }
//     public This(int a, int b){
//         System.out.println("Int Int Constructor Called");
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         new This();
//     }
// }
class Pascal{
    public static void main(String[] args) {
        int c = 1;
        int a=1;
        for(int i=0; i<5; i++){
            for(int sp=4; sp>=i; sp--){
                System.out.print(" ");
            }
            // for(int j=0; j<=i; j++){
                c = a;
                while(c!=0){
                    int digit = c%10;
                    System.out.print(digit+" ");
                    c = c/10;
                }
                System.out.println(" ");
                a = a * 11;
            // }
            // System.out.println();
        }
    }
}