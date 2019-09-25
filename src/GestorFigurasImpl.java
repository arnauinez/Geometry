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
        Figure[] list = new Figure[2];
        list[0] = new Rectangle(10,3);
        list[1] = new Rectangle(1,3);
       // p.run(list);
        System.out.println(p.sumArea(list));
    }

    public void run(Figure [] list)
    {
        GestorFigures gestor = new GestorFigurasImpl();
        System.out.println(gestor.sumArea(list));
    }
}
