package chapter5;

/**
 * Программа демонстрирующая, что целевая
 * часть цикла while - модет быть пустой.
 *
 * @author Ломовской К.Ю.
 * @since 11.04.2019
 */
public class NoBody {

    public static void main(String[] args) {

        int i, j;
        i = 100;
        j = 200;

        // Расачитать среднее значение переменных i и j.
        while (++i < --j);  // У этого цикла отсутствует тело

        System.out.println("Среднее значение равно " + i);
    }
}
