public abstract class Figure implements Comparable{
    //Abstract class because needs to be implemented later by others figure characteristics

    public abstract double area();

    public double CompareTo(Figure f) {
        return (this.area() - f.area());
    }
}
