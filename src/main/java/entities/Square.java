package entities;

public class Square extends Shape{
    private Point topLeft;
    private  int width;

    public Square() {
    }

    public Square(Point topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
    }

    @Override
    public void fromConSole() {
        super.fromConSole();
    }

    @Override
    public double caculatorArea() {
        return this.width*this.width;
    }
}
