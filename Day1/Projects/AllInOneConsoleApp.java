import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.println("Menu: ");
        System.out.println("1. Calculator ");
        System.out.println("2. Grader ");
        System.out.println("3. Loop printer ");

        while(true){
            System.out.print("Choice: ");
            int choice = input.nextInt();

            if(choice == 1){
                System.out.print("Enter 1st number: ");
                int a = input.nextInt();

                System.out.print("Enter 2nd number: ");
                int b = input.nextInt();

                int result = 0;

                System.out.println("Operator: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                while(true) {
                    System.out.print("Choice: ");
                    int op = input.nextInt();

                    if (op == 1) {
                        result = a + b;
                        System.out.println("Sum is " + result);
                        break;
                    } else if (op == 2) {
                        result = a - b;
                        System.out.println("Difference is " + result);
                        break;
                    } else if (op == 3) {
                        result = a * b;
                        System.out.println("Product is " + result);
                        break;
                    } else if (op == 4) {
                        result = a / b;
                        System.out.println("Quotient is " + result);
                        break;
                    }
                }

                break;
            }

            else if(choice == 2){
                int subjectInputCount = 0;
                int subjectGrade = 0;
                double result = 0;
                while(true) {
                    System.out.print("Enter grade(0 to exit): ");
                    int subjInput = input.nextInt();

                    subjectGrade += subjInput;
                    if(subjInput != 0){
                        subjectInputCount++;
                    }
                    else{
                        result =  subjectGrade / subjectInputCount;
                        System.out.println("Total subject is " + subjectInputCount);
                        System.out.println("Total subject is " + subjectGrade);
                        System.out.println("Average grade is: " + result);
                        break;
                    }
                }
                break;
            }

            else if(choice == 3){
                input.nextLine();
                
                System.out.print("Enter a word: ");
                String word = input.nextLine();

                System.out.print("Enter how many times? ");
                int count = input.nextInt();

                for (int i = 0; i <= count; i++) {
                    System.out.println(word);
                }

                break;
            }
        }
        
    }
}

