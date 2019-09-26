import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class GestorFigurasImpl implements GestorFigures {

    public void sort(Figure[] list) {

        Arrays.sort(list,Collections.reverseOrder());
        System.out.printf("De mayor a menor %s",Arrays.toString(list));

    }


    public double sumArea(Figure[] list) {
        double sum=0;

        for (Figure figure: list) {
            sum += figure.area();
        }
        return sum;
    }



    public static void main(String[] args) {
        GestorFigurasImpl p= new GestorFigurasImpl();
        Figure[] list = new Figure[5];
        list[0] = new Rectangle(10,3);
        list[1] = new Rectangle(1,3);
        list[2] = new Square(3);
        list[3] = new Triangle(2,2);
        list[4] = new Circle(1);
        System.out.println(p.sumArea(list));
        p.sort(list);

    }



}
