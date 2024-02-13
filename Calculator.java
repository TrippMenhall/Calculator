import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Whole Numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Which opporation would you like to perform? (addition, subtraction, multiplication, division)");
        String opporation = sc.nextLine();

        double answer = 0.0;

        if((num2 == 0) && opporation.equals("division")){
            System.out.println("Error: Divide by Zero");
        }else{
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
        }

        sc.close();
    }
}