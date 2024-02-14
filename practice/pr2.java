// package java.practice;

class A {
    int a;
    String b;
    public void m1(){
        System.out.println("value of a = "+a+"\n Value of b = "+b);
    }
}

class B extends A{
    int c;
    public void m1(){
        System.out.println("Sub class m1 ");
        System.out.println("value of c "+c);
    }
    public static void main(String args[]){
        A obj = new B();
        System.out.println("value of a = "+obj.a);
        System.out.println("value of b "+obj.b);
        obj.m1();
    }
}
