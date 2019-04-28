package chapter6.Stask;

/**
 * Программа демонстрирующая,
 * использования классе стека.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
public class TestStask {

    public static void main(String[] args) {
        Stask myStask1 = new Stask();
        Stask myStask2 = new Stask();

        // Разместить числа в стеке
        for (int i = 0; i < 10; i++) myStask1.push(i);
        for (int i = 10; i < 20; i++) myStask2.push(i);

        // Извлеч числа из стека
        System.out.println("Содержание стека myStask1");
        for (int i = 0; i < 10; i++)
            System.out.println(myStask1.pop());

        System.out.println("Содержание стека myStask2");
        for (int i = 0; i < 10; i++)
            System.out.println(myStask2.pop());
    }

}
