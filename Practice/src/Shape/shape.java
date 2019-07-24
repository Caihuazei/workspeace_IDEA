package Shape;

public abstract class shape {
    double area,per;
    String color;

    public shape(String color) {
        this.color = color;
    }

    public shape() {
    }

    abstract double getArea();
    abstract double getPer();
    abstract void showAll();
}
