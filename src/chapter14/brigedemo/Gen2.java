package chapter14.brigedemo;

/**
 * Класс демонстрирующий,
 * создание мостового метода.
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class Gen2 extends Gen<String> {

    Gen2(String o) {
        super(o);
    }

    // Перегрузить метод getOb() для получения
    // символьных строк
    String getOb(){
        System.out.print("Вызван метод String getOb(): ");
        return ob;
    }
}
