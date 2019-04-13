package chapter5;

/**
 * Программа демонстрирующая,
 * првоерку на простые числа с помощью цикла for.
 *
 * @author Ломовской К.Ю.
 * @since 13.04.2019
 */
public class FindPrime {

    public static void main(String[] args) {

        int num;
        boolean isPrime;

        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/1; i++){
            if ((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Простое число.");
        else System.out.println("Составное число.");
    }
}
