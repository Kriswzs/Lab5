public class point {
    int x;   // Each Point object has
    int y;   // an int x and y inside.
    int Point() {
        x = 0;
        y = 1;
    }
    Point(int p_x, int p_y) {
        x = p_x;
        y = p_y;
    }
    Point(int point_x, int point_y) {
        x = point_x + 1;
        y = point_y + 1;
    }

    public static void draw(Graphics g) {
        // draws this point
        g.fillOval(p1.x, p1.y, 3, 3);
        g.drawString("(" + p1.x + ", " + p1.y + ")", p1.x, p1.y);
    }
    public void translate(int dx, int dy) {
        // Shifts this point's x/y by the given amounts.
        int x = x + dx;
        int y = y + dy;
    }
    public double distanceFromOrigin() {
        // Returns this point's distance from (0, 0)
        double dist = Math.sqrt(p.x * p.x + p.y * p.y);
        return dist;
    }
}

}
