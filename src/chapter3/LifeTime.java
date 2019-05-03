package chapter3;

/**
 * Пример для демонстрации жизненного цикла переменной.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class LifeTime {

    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y = -1;                         // Переменная y инициируется при каждом вхъоде в блок кода.
            System.out.println("y равно " + y); // Здесь всегда будет выводится -1.
            y = 100;
            System.out.println("y теперь равно " + y);
        }
    }
}
