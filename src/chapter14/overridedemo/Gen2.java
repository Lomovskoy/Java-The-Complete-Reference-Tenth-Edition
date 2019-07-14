package chapter14.overridedemo;

/**
 * Класс демонстрирующий, класс производный от класса Gen
 * и переопределяющий метод getOb()
 *
 * @author Ломовской К.Ю.
 * @since 14.07.2019
 */
class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }

    // Переопределим метод getOb()
    T getOb(){
        System.out.print("Мметод getOb() из класса Gen2: ");
        return ob;
    }
}
