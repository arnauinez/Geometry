
public class Triangle extends Figure{
    private double base;
    private double height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return ((this.base*this.height)/2);
    }


}
