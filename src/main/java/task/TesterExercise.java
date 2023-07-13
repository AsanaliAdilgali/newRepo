package task;

import java.util.Scanner;

public class TesterExercise {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        double doub = scanner.nextDouble();

        double celsius = doub;
        System.out.println("Temperature in kelvin: ");
        System.out.println(String.format("%.5f",celsius + 273.15));
        System.out.println("Temperature in fahrenheit: ");
        System.out.println((celsius * 1.80 + 32.00));

    }
}
