
import java.util.Scanner;

class Phonebook {
    private String name;
    private String phone;
    private String address;

    public Phonebook(String name, String phone, String address) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Phonebook() {

    }

    class Personal {
        private String relation;

        public Personal(String relation) {
            this.relation = relation;
        }

        public void putinput() {
            System.out.println("Relation : " + relation);
        }

        public String getname() {
            return name;
        }

        public String getphone() {
            return phone;
        }

        public String getaddress() {
            return address;
        }

    }

    public static class Business {
        private  String organization;
        private  String dept;
        private  String mobile;

        public void accept(String a, String de, String mob) {
            dept = de;
            mobile = mob;
            organization = a;
        }

        public void show() {
            System.out.println("Organization Name : " + organization);
            System.out.println("Department Name : " + dept);
            System.out.println("Mobile Name : " + mobile);
        }
    }

}

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.println("Enter : 1 for personal record\t\t Enter : 2 for business entry");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            
            System.out.println("Enter your phone number :");
            String phone = sc.nextLine();
            
            System.out.println("Enter your address :");
            String address = sc.nextLine();
            
            System.out.println("Relation : ");
            String relation = sc.nextLine();
            
            Phonebook.Personal obj = new Phonebook(name, phone, address).new Personal(relation);
            
            System.out.println("Name : " + obj.getname());
            System.out.println("Phone number : " + obj.getphone());
            System.out.println("Address : " + obj.getaddress());

        } else {
            
            System.out.println("Enter Organization name : ");
            String organization = sc.nextLine();
            
            System.out.println("Enter Department Name : ");
            String dept = sc.nextLine();
            
            System.out.println("Enter Mobile Number : ");
            String mobile = sc.nextLine();
            
            Phonebook.Business obj = new Phonebook.Business();
            obj.accept(organization, dept, mobile);
            obj.show();

        }
    }
}
