package chapter7.recursion;

/**
 * Программа демонстрирующая, пример рекурсии.
 *
 * @author Ломовской К.Ю.
 * @since 03.05.2019
 */
class Factorial {

    // Это рекурсивный метод
    int fact(int n){
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
