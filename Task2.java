// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        fractal();
    }

    static void fractal(){
        int res = 1;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        System.out.println(number);

        for(int i = 1; i < number+1; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}

