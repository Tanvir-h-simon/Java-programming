class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Distance method with two specified points
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }

    // Distance method with specified coordinates
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

    // Static distance method
    public static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }
}