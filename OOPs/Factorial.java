//5) WAP to find out the factorial of a number.

class Factorial{
    public int fact(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;

    }
}
class Testmain{
    public static void main(String[] args){
        Factorial obj = new Factorial();
        int c = obj.fact(5);
        System.out.println(c);
        
    }
}
