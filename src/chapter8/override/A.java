package chapter8.override;

/**
 * Программа демонстрирующая, создание супер класса.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class A {

    int i, j;

    A(int a, int b){
        i = a;
        j = b;
    }

    // Вывести содержимое переменных i и j
    void  show(){
        System.out.println("i и j: " + i + " " + j);
    }
}
