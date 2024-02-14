// package java.practice;

/**
 * Innerpr3
 */
 interface I1 {
    int a = 10;
   default void m1(){
    System.out.println("interface method");
   }    
}
public class pr3 implements I1{
    // int a = 20;
    public void m1(){
        System.out.println("m1 method override ");
        System.out.println("Value of a = "+a);
    }
    public static void main(String args[]){
        pr3 obj = new pr3();
        obj.m1();
        I1 obj1 = new I1() {
            public void m1(){
                System.out.println("override");
            }
        };
        
        obj1.m1();
    }
}
