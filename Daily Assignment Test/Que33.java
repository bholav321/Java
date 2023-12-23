import java.util.Scanner;

public class Que33 {
        String name[], phone_no[];
        int salary[];
   public void employee(String name[], String phone_no[], int salary[]){
      for(int i=0; i<name.length; i++){
        System.out.println((i+1)+" Employee ");
        System.out.println(" Name of the employ : "+name[i]);
        System.out.println(" Salary of the employ : "+salary[i]);
        System.out.println(" Phone no. of the employee : "+phone_no[i]);
      }
   }
}
class Testmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee");
        int size = sc.nextInt();
        String name[] = new String[size];
        int salary[] = new int[size];
        String phone_no[] = new String[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter "+(i+1)+" employee name : ");
            name[i] = sc.next();
            sc.nextLine();
            System.out.println("Enter "+(i+1)+" employee salary : ");
            salary[i] = sc.nextInt();
            System.out.println("Enter "+(i+1)+" employee phone no. : ");
            phone_no[i] = sc.next();
            sc.nextLine();
        }
        Que33 obj = new Que33();
        obj.employee(name, phone_no, salary);
    }
}