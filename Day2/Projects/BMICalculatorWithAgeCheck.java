import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("BMI calculation is for 18 and above only.");
        } else {
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = input.nextDouble();

            double bmi = weight / (height * height);

            System.out.println("Your BMI is: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal weight");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }

    }
}

