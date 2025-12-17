import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    // Celsius to Kelvin
    static double cToK(double c) {
        return c + 273.15;
    }

    // Fahrenheit to Celsius
    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    // Kelvin to Celsius
    static double kToC(double k) {
        return k - 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double value = sc.nextDouble();

        System.out.println("Enter unit (C / F / K):");
        char unit = sc.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.println("Fahrenheit: " + cToF(value));
                System.out.println("Kelvin: " + cToK(value));
                break;

            case 'F':
                double c1 = fToC(value);
                System.out.println("Celsius: " + c1);
                System.out.println("Kelvin: " + cToK(c1));
                break;

            case 'K':
                double c2 = kToC(value);
                System.out.println("Celsius: " + c2);
                System.out.println("Fahrenheit: " + cToF(c2));
                break;

            default:
                System.out.println("Invalid unit!");
        }

        sc.close();
    }
}
