// package java.practice;



class A {
    public  void m1(){
        System.out.println("Super class..");
    }
}

class B extends A {
    public  void m1(){
        System.out.println("Sub class..");
    }
    public static void main(String args[]){
        System.out.println("main");
        A obj = new B();
        obj.m1();
    }
}