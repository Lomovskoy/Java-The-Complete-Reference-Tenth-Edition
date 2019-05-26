package chapter8.demosuper;

/**
 * Программа демонстрирующая,
 * полную реализацию класса BoxWeight
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class DemoSuper {

    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight(); // По умолчанию
        BoxWeight myBox4 = new BoxWeight(3, 2);
        BoxWeight myBox5 = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);
        System.out.println("Вес myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);
        System.out.println("Вес myBox2 = " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Объем myBox3 = " + vol);
        System.out.println("Вес myBox3 = " + myBox3.weight);
        System.out.println();

        vol = myBox4.volume();
        System.out.println("Объем myBox4 = " + vol);
        System.out.println("Вес myBox4 = " + myBox4.weight);
        System.out.println();

        vol = myBox5.volume();
        System.out.println("Объем myBox5 = " + vol);
        System.out.println("Вес myBox5 = " + myBox5.weight);
        System.out.println();
    }
}
