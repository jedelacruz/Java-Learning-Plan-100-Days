import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        char initial = name.charAt(0);

        System.out.println("Your first initial is: " + initial);
    }
}

