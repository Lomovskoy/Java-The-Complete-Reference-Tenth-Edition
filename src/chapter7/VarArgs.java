package chapter7;

/**
 * Программа демонстрирующая, применение
 * аргументоув переменной длинны.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
public class VarArgs {

    // Теперь метод vaTest() объявляется с аргументами
    // переменной длинны
    static void vaTest(int ... v){
        System.out.print("Количесво аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        // Обратите внимание на возможные способы вызова
        // матода vaTest() с аргументами переменной длинны
        vaTest(10);         // 1 аргумент
        vaTest(1, 2, 3);    // 3 аргумента
        vaTest();               // без аргументов
    }
}
