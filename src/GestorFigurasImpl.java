public class GestorFigurasImpl implements GestorFigures {
    @Override
    public void sort(Figure[] list) {

    }

    @Override
    public double sumArea(Figure[] list) {
        double sum=0;
        for (Figure figure: list) {
            sum += figure.area();
        }
        return sum;
    }

    /*@Override
    public double sum(Figure[] list) {
        double sum=0;
        for (Figure figure: list) {
            sum += figure.area();
        }
        return sum;
    }*/

    public static void main(String[] args) {
        GestorFigurasImpl p= new GestorFigurasImpl();
        Figure[] list = new Figure[5];
        list[0] = new Rectangle(10,3);
        list[1] = new Rectangle(1,3);
        list[2] = new Square(3);                        //Per que apareix "|:"?
        list[3] = new Triangle(2,2);
        list[4] = new Circle(1);
        System.out.println(p.sumArea(list));
    }


}
