import java.util.*;
public class gg
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a double:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter a string:");
        scanner.nextLine(); // Consume newline character left by nextDouble()
        String message = scanner.nextLine();

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Message: " + message);

        scanner.close();
    }
}