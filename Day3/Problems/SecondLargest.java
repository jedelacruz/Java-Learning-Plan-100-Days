import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter numbers: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        System.out.println("Numbers are: ");
        for(int i = 0; i < numbers.length; i++){
            if(i == numbers.length - 1){
                System.out.print(numbers[i]);
            }
            else{
                System.out.print(numbers[i] + ", ");
            }
        }

        Arrays.sort(numbers);

        System.out.println();
        System.out.println("Largest number is " + numbers[numbers.length - 1]);
        System.out.println("Second largest number is " + numbers[numbers.length - 2]);
        
    }
}

