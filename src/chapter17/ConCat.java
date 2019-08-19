package chapter17;

/**
 * Класс демонстрирующий использование
 * сцепления строк (конкатинация).
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class ConCat {

    public static void main(String[] args) {

        String longString = "Это может быть очень длинная " +
                "строка, которую следовало бы " +
                "перенести на новую строку. " +
                "Но благодаря сцеплению " +
                "этого удаётся избежать.";

        System.out.println(longString);
    }
}
