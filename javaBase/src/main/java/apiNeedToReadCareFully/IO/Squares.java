package apiNeedToReadCareFully.IO;

import java.awt.*;

import static java.lang.Math.PI;

public class Squares {
}

class Square {
    public Point topLeft;
    public double side;
}

class Rectangle {
    public Point topLeft;
    public double height;
    public double width;
}

class Circle {
    public Point center;
    public double radius;
}

class Geometry {
    public double area(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius * c.radius;
        }
        throw new NoSuchShapeException();
    }

}
