// MyPoint class (from Exercise 10.4)
class MyPoint {
    private double x;
    private double y;

    // No-arg constructor that creates a point at (0, 0)
    public MyPoint() {
        this(0, 0);
    }

    // Constructor that creates a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Method that returns the distance from this point to another point
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    // Method that returns the distance from this point to another point with specified coordinates
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}

// Triangle2D class
class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    // No-arg constructor that creates a default triangle
    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    // Constructor that creates a triangle with specified points
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Getter for p1
    public MyPoint getP1() {
        return p1;
    }

    // Setter for p1
    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    // Getter for p2
    public MyPoint getP2() {
        return p2;
    }

    // Setter for p2
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    // Getter for p3
    public MyPoint getP3() {
        return p3;
    }

    // Setter for p3
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    // Method that returns the area of the triangle
    public double getArea() {
        // Using the formula: Area = |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)| / 2
        return Math.abs(
            p1.getX() * (p2.getY() - p3.getY()) +
            p2.getX() * (p3.getY() - p1.getY()) +
            p3.getX() * (p1.getY() - p2.getY())
        ) / 2.0;
    }

    // Method that returns the perimeter of the triangle
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    // Method that returns true if the specified point is inside this triangle
    public boolean contains(MyPoint p) {
        // Create three triangles using point p and two points of the original triangle
        Triangle2D t1 = new Triangle2D(p, p1, p2);
        Triangle2D t2 = new Triangle2D(p, p2, p3);
        Triangle2D t3 = new Triangle2D(p, p3, p1);

        // Calculate the sum of the areas of the three triangles
        double areaSum = t1.getArea() + t2.getArea() + t3.getArea();

        // If the sum equals the area of this triangle (with a small epsilon for floating-point precision),
        // then the point is inside the triangle
        return Math.abs(areaSum - getArea()) < 1e-10;
    }

    // Overloaded contains method that takes x and y coordinates
    public boolean contains(double x, double y) {
        return contains(new MyPoint(x, y));
    }

    // Method that returns true if the specified triangle is inside this triangle
    public boolean contains(Triangle2D t) {
        // A triangle is inside another triangle if all three points of the triangle
        // are inside the other triangle
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    // Method that returns true if the specified triangle overlaps with this triangle
    public boolean overlaps(Triangle2D t) {
        // Two triangles overlap if at least one point of one triangle is inside the other triangle,
        // or if any of their edges intersect
        
        // Check if any point of t is inside this triangle
        if (contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3())) {
            return true;
        }
        
        // Check if any point of this triangle is inside t
        if (t.contains(p1) || t.contains(p2) || t.contains(p3)) {
            return true;
        }
        
        // Check if any of the edges intersect
        // Define edges of this triangle
        Line2D[] edges1 = {
            new Line2D(p1, p2),
            new Line2D(p2, p3),
            new Line2D(p3, p1)
        };
        
        // Define edges of the other triangle
        Line2D[] edges2 = {
            new Line2D(t.getP1(), t.getP2()),
            new Line2D(t.getP2(), t.getP3()),
            new Line2D(t.getP3(), t.getP1())
        };
        
        // Check if any edge of this triangle intersects with any edge of the other triangle
        for (Line2D edge1 : edges1) {
            for (Line2D edge2 : edges2) {
                if (edge1.intersects(edge2)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // Helper class to represent a line segment for intersection checking
    private static class Line2D {
        private MyPoint start;
        private MyPoint end;
        
        public Line2D(MyPoint start, MyPoint end) {
            this.start = start;
            this.end = end;
        }
        
        // Check if this line segment intersects with another line segment
        public boolean intersects(Line2D other) {
            // Using the orientation method to determine if two line segments intersect
            return doIntersect(start, end, other.start, other.end);
        }
        
        // Helper method to check if two line segments intersect
        private boolean doIntersect(MyPoint p1, MyPoint q1, MyPoint p2, MyPoint q2) {
            // Find the four orientations needed for general and special cases
            int o1 = orientation(p1, q1, p2);
            int o2 = orientation(p1, q1, q2);
            int o3 = orientation(p2, q2, p1);
            int o4 = orientation(p2, q2, q1);
            
            // General case
            if (o1 != o2 && o3 != o4) {
                return true;
            }
            
            // Special Cases
            // p1, q1 and p2 are collinear and p2 lies on segment p1q1
            if (o1 == 0 && onSegment(p1, p2, q1)) {
                return true;
            }
            
            // p1, q1 and q2 are collinear and q2 lies on segment p1q1
            if (o2 == 0 && onSegment(p1, q2, q1)) {
                return true;
            }
            
            // p2, q2 and p1 are collinear and p1 lies on segment p2q2
            if (o3 == 0 && onSegment(p2, p1, q2)) {
                return true;
            }
            
            // p2, q2 and q1 are collinear and q1 lies on segment p2q2
            if (o4 == 0 && onSegment(p2, q1, q2)) {
                return true;
            }
            
            return false; // No intersection
        }
        
        // Helper method to find orientation of triplet (p, q, r)
        // 0 --> Collinear, 1 --> Clockwise, 2 --> Counterclockwise
        private int orientation(MyPoint p, MyPoint q, MyPoint r) {
            double val = (q.getY() - p.getY()) * (r.getX() - q.getX()) -
                         (q.getX() - p.getX()) * (r.getY() - q.getY());
            
            if (Math.abs(val) < 1e-10) {
                return 0; // Collinear
            }
            
            return (val > 0) ? 1 : 2; // Clockwise or Counterclockwise
        }
        
        // Helper method to check if point q lies on line segment pr
        private boolean onSegment(MyPoint p, MyPoint q, MyPoint r) {
            return q.getX() <= Math.max(p.getX(), r.getX()) &&
                   q.getX() >= Math.min(p.getX(), r.getX()) &&
                   q.getY() <= Math.max(p.getY(), r.getY()) &&
                   q.getY() >= Math.min(p.getY(), r.getY());
        }
    }
}

// Test program
public class Main {
    public static void main(String[] args) {
        // Create a Triangle2D object t1
        Triangle2D t1 = new Triangle2D(
            new MyPoint(2.5, 2),
            new MyPoint(4.2, 3),
            new MyPoint(5, 3.5)
        );
        
        // Display t1's area and perimeter
        System.out.println("Triangle t1:");
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        
        // Test the contains(MyPoint p) method
        System.out.println("t1 contains the point (3, 3)? " + t1.contains(3, 3));
        
        // Create another Triangle2D object t2
        Triangle2D t2 = new Triangle2D(
            new MyPoint(2.9, 2),
            new MyPoint(4, 1),
            new MyPoint(1, 3.4)
        );
        
        // Test the contains(Triangle2D t) method
        System.out.println("t1 contains the triangle t2? " + t1.contains(t2));
        
        // Create another Triangle2D object t3
        Triangle2D t3 = new Triangle2D(
            new MyPoint(2, 5.5),
            new MyPoint(4, -3),
            new MyPoint(2, 6.5)
        );
        
        // Test the overlaps(Triangle2D t) method
        System.out.println("t1 overlaps with the triangle t3? " + t1.overlaps(t3));
    }
}