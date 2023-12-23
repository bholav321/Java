import java.util.Scanner;

public class Que32 {
    private String name, phone_no;
    private int salary;

    public Que32(String name, String phone_no, int salary) {
        this.name = name;
        this.salary = salary;
        this.phone_no = phone_no;
    }

    public static void sortdata(Que32 emp[]) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].salary > emp[j].salary) {
                    Que32 temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.println("Name of the employee : " + name);
        System.out.println("Salary of the employee : " + salary);
        System.out.println("Phone no. of the employee : " + phone_no);
    }
}

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee");
        int size = sc.nextInt();
        Que32 emp[] = new Que32[size];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter employee name : ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter employee phone no. ");
            String phone_no = sc.next();
            sc.nextLine();
            System.out.println("Enter employee salary : ");
            int salary = sc.nextInt();
            
            emp[i] = new Que32(name, phone_no, salary);
        }

        Que32.sortdata(emp);

        for(int i=0; i<emp.length; i++){
            System.out.println(i+1);
            emp[i].display();

        }
    

    }
}