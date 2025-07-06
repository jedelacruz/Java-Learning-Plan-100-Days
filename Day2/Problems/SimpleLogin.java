import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String hUsername = "Je1234";
        String hPw = "Je1234";

        System.out.print("Enter username: ");
        String eUsername = input.nextLine();

        System.out.print("Enter password: ");
        String ePw = input.nextLine();

        if(hUsername.equals(eUsername) && hPw.equals(ePw)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Wrong credentials");
        }
        
    }
}

