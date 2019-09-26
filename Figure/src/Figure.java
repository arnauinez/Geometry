public abstract class Figure implements Comparable<Figure>{
    //Abstract class because needs to be implemented later by others figure characteristics

    public abstract double area();

    public int compareTo(Figure f) {
        return (int)(this.area() - f.area());
    }

    public String toString() {
        return this.getClass().getSimpleName()+" "+this.area();
    }
}
