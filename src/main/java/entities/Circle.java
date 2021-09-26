package entities;

import java.util.regex.Matcher;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle() {
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }


    @Override
    public void fromConSole() {
        super.fromConSole();
    }

    @Override
    public double caculatorArea() {
        return Math.PI*this.radius*this.radius;
    }
}
