import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = input.nextInt();

        if (grade >= 75 && grade <= 80) {
            System.out.print("E");
        } else if (grade >= 81 && grade <= 84) {
            System.out.print("C");
        } else if (grade >= 85 && grade <= 89) {
            System.out.print("B");
        } else if (grade >= 90 && grade <= 100) {
            System.out.print("A");
        } else {
            System.out.print("F");
        }
    }
}
