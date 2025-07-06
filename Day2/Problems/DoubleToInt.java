import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = input.nextDouble();

        int conum = (int) num;

        System.out.print(conum);
        
    }
}

