package chapter7.overloaddemo;

/**
 * Программа демонстрирующая, перегрузку метода.
 *
 * @author Ломовской К.Ю.
 * @since 02.05.2019
 */
class OverloadDemo {

    void test(){
        System.out.println("Параметры отсутствуют.");
    }

    // Перегруженный метод, проверяющий наличие
    // одного целочесленного параметра.
    void test(int a){
        System.out.println("a: " + a);
    }

    // Перегруженный метод, проверяющий наличие
    // двух целочесленных параметров.
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a){
        System.out.println("double: " + a);
        return a * a;
    }
}
