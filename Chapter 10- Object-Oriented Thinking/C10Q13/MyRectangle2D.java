class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        // Using the formula: Area = |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)| / 2
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double s = (side1 + side2 + side3) / 2;

        // Heron's formula: Area = √(s(s-a)(s-b)(s-c))
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    // Method to check if a point is inside the triangle
    public boolean contains(MyPoint p) {
        // Create three triangles using the point and two vertices of the original triangle
        Triangle2D t1 = new Triangle2D(p, p1, p2);
        Triangle2D t2 = new Triangle2D(p, p2, p3);
        Triangle2D t3 = new Triangle2D(p, p3, p1);

        // Calculate the sum of the areas of the three triangles
        double areaSum = t1.getArea() + t2.getArea() + t3.getArea();

        // If the sum equals the area of the original triangle (with a small epsilon for floating-point precision),
        // then the point is inside the triangle
        return Math.abs(getArea() - areaSum) < 1E-10;
    }

    // Method to check if a point with coordinates (x, y) is inside the triangle
    public boolean contains(double x, double y) {
        return contains(new MyPoint(x, y));
    }

    // Method to check if another triangle is inside this triangle
    public boolean contains(Triangle2D t) {
        // Check if all three points of triangle t are inside this triangle
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    // Helper method to detect if two-line segments intersect
    private boolean linesIntersect(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
        // Calculate the direction vectors
        double dx1 = p2.getX() - p1.getX();
        double dy1 = p2.getY() - p1.getY();
        double dx2 = p4.getX() - p3.getX();
        double dy2 = p4.getY() - p3.getY();

        // Calculate the determinant
        double determinant = dx1 * dy2 - dy1 * dx2;

        // If a determinant is close to 0, lines are parallel
        if (Math.abs(determinant) < 1E-10) {
            return false;
        }

        // Calculate parameters t and s
        double t = ((p3.getX() - p1.getX()) * dy2 + (p1.getY() - p3.getY()) * dx2) / determinant;
        double s = ((p3.getX() - p1.getX()) * dy1 + (p1.getY() - p3.getY()) * dx1) / determinant;

        // Check if the intersection point lies on both line segments
        return (t >= 0 && t <= 1 && s >= 0 && s <= 1);
    }

    // Method to check if two triangles overlap
    public boolean overlaps(Triangle2D t) {
        // If any vertex of one triangle is inside the other, they overlap
        if (contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3()) ||
                t.contains(p1) || t.contains(p2) || t.contains(p3)) {
            return true;
        }

        // Check if any edge of this triangle intersects with any edge of the other triangle
        MyPoint[] thisPoints = {p1, p2, p3};
        MyPoint[] otherPoints = {t.getP1(), t.getP2(), t.getP3()};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (linesIntersect(thisPoints[i], thisPoints[(i + 1) % 3],
                        otherPoints[j], otherPoints[(j + 1) % 3])) {
                    return true;
                }
            }
        }
        return false;
    }
}