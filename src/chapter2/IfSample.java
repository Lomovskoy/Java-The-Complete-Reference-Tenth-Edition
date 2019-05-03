package chapter2;

/**
 * Пример демонстрации условного оператора if.
 * Присвоить исходному файлу имя "IfSample.java"
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
class IfSample {

    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x равен y");

        x = x * 2;
        if (x > y) System.out.println("x больше y");

        // Этот оператор не будет ничего выводить
        if (x == y) System.out.println("Это сообщение не выведится");
    }
}
