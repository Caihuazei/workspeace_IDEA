package Shape;

public class Circle extends shape{
    double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    double getPer() {
        return 2 * Math.PI * radius;
    }

    @Override
    void showAll() {
        System.out.println("面积："+ getArea()+ "周长："+ getPer() + "颜色："+ color);
    }
}
