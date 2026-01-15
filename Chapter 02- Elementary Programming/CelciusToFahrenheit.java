import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        double celcius = scan.nextDouble();
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println(celcius + " degrees Celcius is " + fahrenheit + " degree Fahrenheit" );
    }
}
