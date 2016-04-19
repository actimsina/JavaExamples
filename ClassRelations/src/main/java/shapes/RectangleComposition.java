package shapes;

/**
 * Created by achyut on 4/19/16.
 * Using Composition
 */

public class RectangleComposition implements Shape {
    Point p1, p2;

    public RectangleComposition(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Override
    public int getArea() {
        int length = p1.getX() - p2.getX();
        int breadth = p1.getY() - p2.getY();

        return Math.abs(length * breadth);
    }
}
