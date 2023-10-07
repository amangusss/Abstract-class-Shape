public class Rectangle extends Shape{

    private double width, height;

    public Rectangle(String name ,double w, double h){
        super("Rectangle");
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }

}