package entities;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Point topLeft;
    private int wight, height;

    public Rectangle() {
    }

    public Rectangle(Point topLeft, int wight, int height) {
        this.topLeft = topLeft;
        this.wight = wight;
        this.height = height;
    }

    @Override
    public void fromConSole() {
        super.fromConSole();
    }

    @Override
    public double caculatorArea() {
        return this.wight*this.height;
    }
}

