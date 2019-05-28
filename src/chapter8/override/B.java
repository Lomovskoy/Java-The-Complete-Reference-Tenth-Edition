package chapter8.override;

/**
 * Программа демонстрирующая, создание подкласса
 * путём расширением супер класса.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class B extends A {

    int k;

    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // Вывести содержание переменной k с метода
    // переопределяющий метод show из класса А
    void show(){
        System.out.println("k: " + k);
    }
}
