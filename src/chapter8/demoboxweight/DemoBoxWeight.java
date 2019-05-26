package chapter8.demoboxweight;

/**
 * Программа демонстрирующая, примение
 * наследование для расширения класса Box().
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class DemoBoxWeight {

    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);
        System.out.println("Вес myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);
        System.out.println("Вес myBox2 = " + myBox2.weight);
    }
}
