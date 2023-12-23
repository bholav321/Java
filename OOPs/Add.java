class Add{
    private int a,b;
    public void setData(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println(a+b);
    }
}
class Testmain{
    public static void main(String[] args){
        Add obj = new Add();
        obj.setData(20, 10);
        obj.add();
    }
}