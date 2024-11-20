package dev.angelo.Views;

import java.util.Locale;
import java.util.Scanner;

public class BmiView {
    
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static double askWeight(){
        System.out.println("Enter you weight in kilograms: ");    
        return scanner.nextDouble();
    }

    public static double askHeight(){
        System.out.println("Enter you height in meters: ");    
        return scanner.nextDouble();
    }

    public static void showResults(double bmi, String clasification){
        System.out.printf("Your BMI is: %.2f\n\n", bmi);
        System.out.println("Your BMI is: "+ clasification);
    }
}
