public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods provide read-only access to the private coefficient fields, preserving encapsulation
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        if (getDiscriminant() < 0) {
            return 0; // Return 0 if the discriminant is negative
        } else {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }

    public double getRoot2(){
        if (getDiscriminant() < 0) {
            return 0; // Return 0 if the discriminant is negative
        } else if (getDiscriminant() == 0) {
            return getRoot1();
        } else {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
}