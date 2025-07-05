import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println("Even: " + i);
            }
            else{
                // System.out.println("Odd: " + i);
            }
        }
    }
}
