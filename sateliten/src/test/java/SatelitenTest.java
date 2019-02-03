import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class SatelitenTest {
    private Satelit satelit;

    @Before
    public void before() {
        Point p = new Point(1, 1);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 3);
        Point p4 = new Point(1, 4);
        Point p5 = new Point(1, 5);
        satelit = Satelit.withRoute(Arrays.asList(p, p2, p3, p4, p5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsOnRouteNullException() {
        Satelit.withRoute(null);
    }

    @Test
    public void testIsOnRoute() {
        Point p = new Point(1, 1);

        Assert.assertTrue(satelit.isOnRoute(p));
    }

    @Test
    public void testIsOnRoute2() {
        Point p2 = new Point(1, 1);

        Assert.assertTrue(satelit.isOnRoute(p2));
    }

    @Test
    public void testIsOnRoute3() {
        Point p2 = new Point(2, 1);

        Assert.assertFalse(satelit.isOnRoute(p2));
    }

    @Test
    public void testIsOnRouteNull() {
        Assert.assertFalse(satelit.isOnRoute(null));
    }

    @Test
    public void testWhenAreYouOver() {
        Point p = new Point(1, 1);

        Assert.assertEquals(0, satelit.whenAreYouOver(p));
    }

    @Test(expected = PointNotInTheRouteException.class)
    public void testWhenAreYouOverException() {
        Point p = new Point(3, 1);
        satelit.whenAreYouOver(p);
    }


    @Test
    public void testWhenAreYouOverIn2() {
        Point p1 = new Point(1, 3);
        Assert.assertEquals(2, satelit.whenAreYouOver(p1));
    }


}
