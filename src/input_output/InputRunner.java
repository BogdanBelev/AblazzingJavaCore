package input_output;

import OOP.Basics.Lesson_5_Static.Car;

/*
* Scanner scanner = new Scanner(System.in) - импортирует возможность принимать значения из консоли
* scanner.next() - вызов метода next() (возвращает текст) из класса Scanner для того, чтобы вносить значения в консоль
 */

import java.util.Scanner;

public class InputRunner {
    public static void main(String[] args) throws Exception {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        long num1 = scanner.nextLong();
        System.out.print("Enter the operation type: ");
        String operationType = scanner.next();
        System.out.print("Enter the second num: ");
        long num2 = scanner.nextLong();

        long res = calc.makeOperation(num1, num2, operationType);
        System.out.println("Result: " + res);
    }
}
