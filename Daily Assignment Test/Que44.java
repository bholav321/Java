import java.util.Scanner;

interface Shape{
    float getarea();
}
class Circle implements Shape{
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public Circle(){

    }
    public float getarea(){
        float pi=3.14f;
        return 2*pi*radius*radius;
    }
}
class Rectangle implements Shape{
    private float length;
    private float width;
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){

    }
    public float getarea(){
        return length*width;
    }
}
class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius ");
        float radius = sc.nextFloat();
        Circle obj = new Circle(radius);
        System.out.println("Area of Circle "+obj.getarea());
        System.out.println("Enter Length of the rectangle");
        float length = sc.nextFloat();
        System.out.println("Enter Width of the ractangle");
        float width = sc.nextFloat();
        Rectangle obj1 = new Rectangle(length, width);
        System.out.println("Area of Rectangle "+obj1.getarea());
        
    }
}