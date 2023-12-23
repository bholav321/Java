import java.util.Scanner;

interface Colleage{
    void collegename();
}
class Teacher{
    private String name;
    private String qualification;
    public Teacher(String name, String qualification){
        this.name= name;
        this.qualification = qualification;
    }
    public Teacher(){

    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Qualification : "+qualification);
    }
}
class Department  extends Teacher implements Colleage{
    private int depno;
    private String depname;
    private String collegename;
    public Department(String name, String qualification , int depno, String depname,String collegename){
        super(depname, qualification);
        this.depno = depno;
        this.depname = depname;
      
    }
    public Department(){}
    public void display(){
        super.display();
        System.out.println("Department Name : "+depname);
        System.out.println("Department No. : "+depno);
    }
    public void collegename(){
        System.out.println("College Name : "+collegename);
    }

}
class TeacherMain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = sc.nextLine();
        System.out.println("Enter Qualification ");
        String qualification = sc.nextLine();
        System.out.println("Enter Department NO. ");
        int depno = sc.nextInt();
        System.out.println("Enter Department Name ");
        sc.nextLine();
        String depname = sc.nextLine();
        System.out.println("Enter colleage name ");
        String collegename = sc.nextLine();
        Department obj1 = new Department(name , qualification,depno, depname,collegename);
        obj1.display();
        obj1.collegename();

    }
}