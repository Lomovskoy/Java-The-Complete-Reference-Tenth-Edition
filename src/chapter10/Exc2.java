package chapter10;

/**
 * Программа демонстрирующая,
 * пример обрабатываемого исключения.
 *
 * @author Ломовской К.Ю.
 * @since 11.06.2019
 */
class Exc2 {

    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведенно.");
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        System.out.println("Посале оператора catch");
    }
}
