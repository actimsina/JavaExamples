package shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by achyut on 4/19/16.
 */
public class RectangleTest {
    @Test
    public void testOfRectangleComposition(){
        RectangleComposition r1 = new RectangleComposition(0, 0, 2, 2);
        assertEquals(4, r1.getArea());
    }

    @Test
    public void testOfRectangleAggregation(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 2);
        RectangleAggregation r1 = new RectangleAggregation(p1, p2);
        assertEquals(4, r1.getArea());
    }
}
