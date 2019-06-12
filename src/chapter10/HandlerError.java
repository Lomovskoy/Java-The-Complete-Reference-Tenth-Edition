package chapter10;

import java.util.Random;

/**
 * Программа демонстрирующая, пример обработки
 * исключения и продолжения работы.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class HandlerError {

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++){
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e){
                System.out.println("Деление на ноль.");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
