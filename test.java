package demoTestForGit;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();    
        
        int sum = number + number2;
        System.out.println("The sum of the two numbers is: " + sum);

        scanner.close();
    }
}

