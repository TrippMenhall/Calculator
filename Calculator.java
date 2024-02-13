import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Whole Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Which opporation would you like to perform? (addition, subtraction, multiplication, division)");
        String opporation = sc.nextLine();

        int answer = 0;

        switch(opporation){
            case "addition":
                answer = num1 + num2;
                System.out.println(answer);
                break;
            case "subtraction":
                answer = num1 - num2;
                System.out.println(answer);
                break;
            case "multiplication":
                answer = num1 * num2;
                System.out.println(answer);
                break;
            case "division":
                answer = num1 / num2;
                System.out.println(answer);
                break;
            default:
                System.out.println("Error: Not a valid opporation!");
        }

        sc.close();
    }
}