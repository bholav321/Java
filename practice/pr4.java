abstract class A{
    int a;
    public A(int a){
        this.a = a;
    }
    public void m1(){
        System.out.println("value of a = "+a);
    }
    abstract void m2();                         
}

class B extends A{
    public B(){
        super(10);
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public static void main(String args[]){
        B obj = new B();
        obj.m1();
    }
}