package chapter17.tostringdemo;

/**
 * Класс демонстрирующий переопределение
 * метода toString() в классе Box.
 *
 * @author Ломовской К.Ю.
 * @since 19.08.2019
 */
class ToStringDemo {

    public static void main(String[] args) {

        Box b = new Box(10, 12, 14);
        // Выполнить конкатинацию символьной строки
        // с объектом типа Box
        String s = "Объект b типа Box: " + b;
        // Преобразовать объект типа Box в
        // символьную строку при выводе в консоль
        System.out.println(b);
        System.out.println(s);
    }
}
