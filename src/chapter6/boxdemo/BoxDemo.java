package chapter6.boxdemo;

/**
 * Программа демонстрирующая,
 * использование класаа Box.
 *
 * @author Ломовской К.Ю.
 * @since 28.04.2019
 */
class BoxDemo {

    public static void main(String[] args) {
        // Объявляется объект типа Box
        Box myBox = new Box();
        double vol;

        // Присвоить значение переменным экземпляра класса myBox
        myBox.wight = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // Расчёт объема паралелепипеда
        vol = myBox.wight * myBox.height * myBox.depth;

        System.out.println("Объем равен " + vol);
    }
}
