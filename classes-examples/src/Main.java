import interfaces.Animal;
import interfaces.Cat;
import interfaces.Dog;
import models.persons.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            test();

            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den; // may throw ArithmeticException
            System.out.println("Result: " + result);

            String test = null;
            test.length();
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (NullPointerException e) {
            System.out.println("String s is null");
        }
        finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }

    public static void test() {
        System.out.print("test");
    }
}
