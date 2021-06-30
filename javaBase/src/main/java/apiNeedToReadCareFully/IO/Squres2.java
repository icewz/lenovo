package apiNeedToReadCareFully.IO;

import java.awt.*;

import static java.lang.Math.PI;

public class Squres2 {
    abstract class Square implements Shape{
        public Point topLeft;
        public double side;

        public double area() {
            return side * side;
        }
    }

    abstract class Rectangle implements Shape{
        public Point topLeft;
        public double height;
        public double width;
        public double area() {
            return height * width;
        }
    }

    abstract class Circle implements Shape{
        public Point center;
        public double radius;
        public double area() {
            return PI * radius * radius;
        }
    }
}
