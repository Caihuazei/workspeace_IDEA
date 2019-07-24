package Shape;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        shape[] shapes = new shape[2];
        Rectangle r = new Rectangle("蓝色",1,2);
        shapes[0]=r;
        Circle c = new Circle("红色",1.2);
        shapes[1]= c;

        for (shape shape : shapes) {
            shape.showAll();
        }
    }
}
