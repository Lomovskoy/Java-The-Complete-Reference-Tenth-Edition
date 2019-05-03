package chapter7.overloaddemo2;

/**
 * Программа демонстрирующая,
 * автоматическое преобразование типов при перегрузке.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class OverloadDemo {

    void test(){
        System.out.println("Параметры отсутствуют.");
    }

    // Перегруженный метод, проверяющий наличие
    // двух целочесленных параметров.
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a){
        System.out.println("Внутренне преобразование при вызове test(double a): " + a);
    }
}
