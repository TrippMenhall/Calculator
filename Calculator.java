import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Whole Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = num1 + num2;
        System.out.println(answer);
    }
}