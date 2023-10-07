public class Square extends Shape {

    private final double sideLenght;

    public Square(String name, double sideLenght) {
        super("Square");
        this.sideLenght = sideLenght;
    }

    @Override
    public double getArea() {
        return sideLenght*sideLenght;
    }

    @Override
    public double getPerimeter() {
        return sideLenght*4;
    }
}