public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

//    public double getFeet() {
//        return feet;
//    }
//
//    public double getInches() {
//        return inches;
//    }

    public double getHeight() {
        return (feet * 12) + inches;
    }

    public double calcBMI () {
        return weight * (1.0 / (getHeight() * getHeight())) * 703.0;
    }

    public String getBMIStatus() {
        if (calcBMI() < 18.5) {
            return "Underweight";
        } else if (calcBMI() >= 18.50 && calcBMI() < 25.0) {
            return "Normal weight";
        } else if (calcBMI() >= 25.0 && calcBMI() < 30.0) {
            return "Overweight";
        } else if (calcBMI() >= 30.0) {
            return "Obesity";
        } else {
            return "Invalid calculations";
        }
    }
}