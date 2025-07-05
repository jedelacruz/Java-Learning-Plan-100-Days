import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.print(num + " is even");
        }
        else{
            System.out.print(num + " is odd");
        }

    }
}
