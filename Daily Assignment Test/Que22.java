import java.util.Scanner;

public class Que22 {
    public void sphere(float pi){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float radius = sc.nextFloat();
        float vol = pi*radius*radius*radius;
        System.out.println("Volume of Sphere : "+vol);
    }
}
class Test{
    public static void main(String[] args) {
        float pi = 3.14f;
        Que22 obj = new Que22();
        obj.sphere(pi);
    }
}