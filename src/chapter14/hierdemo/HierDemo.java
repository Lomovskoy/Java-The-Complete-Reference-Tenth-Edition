package chapter14.hierdemo;

/**
 * Класс демонстрирующий, что в подкласс
 * могут выть введены свои параметры типа
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class HierDemo {

    public static void main(String[] args) {

        // Создать объект типа Gen2 для
        // Символьных строк и целых чисел
        Gen2<String, Integer> x = new Gen2<String, Integer>("Значение равно: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());

    }
}
