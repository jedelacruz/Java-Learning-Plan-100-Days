import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int num1st = input.nextInt();

        System.out.print("Enter 2nd num: ");
        int num2nd = input.nextInt();

        System.out.print("Enter 3rd num: ");
        int num3rd = input.nextInt();

        if(num1st > num2nd && num1st > num3rd){
            System.out.print(num1st + " is the largest");
        }
        else if(num2nd > num1st && num2nd > num3rd){
            System.out.print(num2nd + " is the largest");
        }
        else if(num3rd > num1st && num3rd > num2nd){
            System.out.print(num3rd + " is the largest");
        }
        else{
            System.out.print("There is a tie.");
        }
    }
}

