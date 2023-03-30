// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        calculator();
    }

    static void calculator() {
        System.out.println("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        Integer number1 = scanner1.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        Integer number2 = scanner2.nextInt();
        System.out.println("Введите действие: ");
        Scanner scanner3 = new Scanner(System.in);
        Character action = scanner3.next().charAt(0);

        int res = 0;

        if (action == '*') {
            res = number1 * number2;            
        }
        else if (action == '/') {
            res = number1 / number2;            
        }
        else if (action == '-') {
            res = number1 - number2;            
        }
        else if (action == '+') {
            res = number1 + number2;            
        }
        System.out.println(res);
        }
    }
