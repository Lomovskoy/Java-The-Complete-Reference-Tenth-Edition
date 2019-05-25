package chapter7;

/**
 * Программа демонстрирующая, применение
 * аргументоув переменной длинны вместе со стандартными аргументами.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
public class VarArgs2 {

    // В данном примере mgs - обычный переметр,
    // а v - переметр переременной длинны
    static void vaTest(String mgs, int ... v){
        System.out.print(mgs + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest("Один переметр переменной длинны: ",10);
        vaTest("Три переметра переменной длинны: ",1, 2, 3);
        vaTest("Без переметров переменной длинны: ");
    }
}
