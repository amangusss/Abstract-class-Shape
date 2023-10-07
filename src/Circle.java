public class Circle extends Shape {
    private double radius;

    private static final double PI = 3.141592653589793;
    
    public Circle(String name ,double radius){
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

}
