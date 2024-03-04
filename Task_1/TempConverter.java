import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement:\n1.Celsius\n2.Fahrenheit\n3.Kelvin\n");
        int choice = scanner.nextInt();

        double convertedCelsius = 0, convertedFahrenheit = 0, convertedKelvin = 0;

        switch (choice) {
            case 1:
                convertedCelsius = temperature;
                convertedFahrenheit = celsiusToFahrenheit(temperature);
                convertedKelvin = celsiusToKelvin(temperature);
                break;
            case 2:
                convertedCelsius = fahrenheitToCelsius(temperature);
                convertedFahrenheit = temperature;
                convertedKelvin = fahrenheitToKelvin(temperature);
                break;
            case 3:
                convertedCelsius = kelvinToCelsius(temperature);
                convertedFahrenheit = kelvinToFahrenheit(temperature);
                convertedKelvin = temperature;
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                System.exit(1);
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + convertedCelsius + " \u00B0C");
        System.out.println("Fahrenheit: " + convertedFahrenheit + " \u00B0F");
        System.out.println("Kelvin: " + convertedKelvin + " K");

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}