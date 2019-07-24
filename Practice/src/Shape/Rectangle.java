package Shape;

import java.awt.*;

public class Rectangle extends shape {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPer() {
        return 2 * (height + width);
    }

    @Override
    void showAll() {
        System.out.println("面积："+ getArea()+ "周长："+ getPer() + "颜色："+ color);
    }
}
