class A{
    static {
        System.out.println("GM......");
    }
    public A(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Initializer block");
    }

}
class B extends A{
    static{
        System.out.println("GN.....");
    }
    public B(){
        System.out.println("Constructor of B class");
    }
    {
        System.out.println("Initializer block of B class");
    }
}
public class Que45 {
    public static void main(String[] args) {
        A obj = new B();
    }   
}
