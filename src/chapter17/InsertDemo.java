package chapter17;

/**
 * Класс демонстрирующий использование
 * метода insert().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class InsertDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Мне Java!");

        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
