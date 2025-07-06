import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        boolean isAdult;

        if(age >= 18){
            isAdult = true;
        }
        else{
            isAdult = false;
        }

        System.out.println(isAdult);

    }
}

