package chapter2;

/**
 * Пример демонстрации применения уцикла for.
 * Присвоить исходному файлу имя "ForTest.java"
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class ForTest {

    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x = x + 1){
            System.out.println("Значение x: " + x);
        }
    }
}
