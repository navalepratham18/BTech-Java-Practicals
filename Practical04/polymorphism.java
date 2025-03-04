import java.text.DecimalFormat;

class Shape{
    void area(){
        System.out.println("\nCalculating area : ");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        double areaCircle = 3.14 * radius*radius;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("Area Of Circle : " + numberFormat.format(areaCircle) +" units sq.");
    }
}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        double areaRectangle = length*breadth;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("Area of Rectangle : "+ numberFormat.format(areaRectangle)+" units sq.");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.area();

        Rectangle r = new Rectangle(3,4);
        r.area();
    }
}
