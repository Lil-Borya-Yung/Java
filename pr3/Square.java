public class Square extends Rectangle{
    protected double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
