package temperature;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Temperature Converter");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Select input scale (1-3): ");
        int fromChoice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Select output scale (1-3): ");
        int toChoice = sc.nextInt();

        double result = convertTemperature(value, fromChoice, toChoice);

        System.out.println("Converted Temperature: " + result);

        sc.close();
    }

    public static double convertTemperature(double value, int from, int to) {

        double celsius = 0;

        // Convert input to Celsius
        if (from == 1) {          // Celsius
            celsius = value;
        } 
        else if (from == 2) {     // Fahrenheit
            celsius = (value - 32) * 5 / 9;
        } 
        else if (from == 3) {     // Kelvin
            celsius = value - 273.15;
        }

        // Convert Celsius to target scale
        if (to == 1) {            // Celsius
            return celsius;
        } 
        else if (to == 2) {       // Fahrenheit
            return (celsius * 9 / 5) + 32;
        } 
        else if (to == 3) {       // Kelvin
            return celsius + 273.15;
        }

        return celsius;
    }
}

