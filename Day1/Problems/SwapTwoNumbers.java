import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();

        System.out.println("Original Numbers:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        /*

        a = 10
        b = 5

        a = a + b = 15
        b = a - b = 10
        a = a - b = 5

         */

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped Numbers:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
    }
}
