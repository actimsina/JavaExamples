package shapes;

/**
 * Created by Achyut on 4/19/16.
 */
public class RectangleAggregation implements Shape {
    Point p1, p2;

    public RectangleAggregation(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public int getArea() {
        int len = p1.getX() - p2.getX();
        int brd = p1.getY() - p2.getY();
        return Math.abs(len * brd);
    }
}
