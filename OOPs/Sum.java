//3) WAP to find out the sum of N natural number.

public class Sum {
    public int sumofnumber(int n){
        int sum = 0; 
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
}
class Testmain{
    public static void main(String[] args){
        Sum obj = new Sum();
        int c = obj.sumofnumber(10);
        System.out.println("Sum of N number : "+c);
    }
}
