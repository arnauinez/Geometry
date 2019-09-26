public class Circle extends Figure{
    public double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

}
