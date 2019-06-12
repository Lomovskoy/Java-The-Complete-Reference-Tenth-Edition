package chapter10.exeptiondemo;

/**
 * Программа демонстрирующая,
 * создание специального типа исклчюения.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class ExeptionDemo {

    static void compute(int a) throws MyExeption{
        System.out.println("Вызывн метод compute(" + a + ")");
        if (a > 10)
            throw new MyExeption(a);
        System.out.println("Нормальное зачершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyExeption e){
            System.out.println("Перехваченно исключение: " + e);
        }
    }
}
