import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestorFiguresTest {
    GestorFigurasImpl p=null;
    Figure[] list=null;

    @Before
    public void setUp() {
        this.p= new GestorFigurasImpl();
        list = new Figure[5];
        list[0] = new Rectangle(10,3);
        list[1] = new Rectangle(1,3);
        list[2] = new Square(3);
        list[3] = new Triangle(2,2);
        list[4] = new Circle(1);
    }


    @Test
    public void testSuma() {
        Assert.assertEquals("area", 47.15,p.sumArea(list), 0.25);
    }

    @Test
    public void testSort() {

        Assert.assertEquals("sort", Rectangle.class, list[0].getClass() );
        p.sort(list);
        Assert.assertEquals("sort", Triangle.class, list[4].getClass() );
        Assert.assertEquals("sort", 30, list[0].area(),0.25 );




    }
}
