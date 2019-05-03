package chapter6.boxdemo4;

/**
 * Программа демонстрирующая,
 * использование класаа Box возвращающий значение.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo4 {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();
        double vol;

        // Присвоить значение переменным экземпляра класса myBox
        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        // Присвоить другие значения переменным экземпляра класса myBox
        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Получить объем первого паралелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второго паралелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
