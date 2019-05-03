package chapter5;

/**
 * Программа демонстрирующая,
 * применеие цикла do-while.
 *
 * @author Ломовской К.Ю.
 * @since 11.04.2019
 */
class DoWhile {

    public static void main(String[] args) {

        int n = 10;

        do{
            System.out.println("такт - " + n);
        }while (--n > 0);
    }
}
