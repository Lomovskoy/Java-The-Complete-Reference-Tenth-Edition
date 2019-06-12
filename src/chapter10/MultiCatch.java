package chapter10;

/**
 * Программа демонстрирующая, пример
 * множественное исключение.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
public class MultiCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a / b; // Сгенерировать исключение типа ArithmeticException
            // vals[10] = 19    // Сгенерировать исключение типа ArrayIndexOutOfBoundsException

        // В этом операторе catch перехватываются оба исклчюение
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение перехваченно: " + e);
        }
        System.out.println("После многократнго перехвата.");
    }
}
