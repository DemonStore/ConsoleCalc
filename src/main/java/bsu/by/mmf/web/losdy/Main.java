package bsu.by.mmf.web.losdy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите первое число");
            int firstNumber = sc.nextInt();

            System.out.println("Введите второе число");
            int secondNumber = sc.nextInt();

            System.out.println("Введите знак операции");
            char operation = sc.next().charAt(0);

            int result = 0;
            switch (operation) {
                case '+':
                    result = add(firstNumber, secondNumber);
                    break;
                case '-':
                    result = subtract(firstNumber, secondNumber);
                    break;
                case '*':
                    result = multiply(firstNumber, secondNumber);
                    break;
                case '/':
                    result = divide(firstNumber, secondNumber);
                    break;
                default:
                    throw new IllegalArgumentException("Wrong operation symbol");
            }

            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Wrong format of number");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
