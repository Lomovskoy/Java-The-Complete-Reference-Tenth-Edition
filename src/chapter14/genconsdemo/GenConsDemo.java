package chapter14.genconsdemo;

/**
 * Класс демонстрирующий
 * простой обощённый конструктор.
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class GenConsDemo {

    public static void main(String[] args) {

        GenCons test1 = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test1.showVal();
        test2.showVal();
    }
}
