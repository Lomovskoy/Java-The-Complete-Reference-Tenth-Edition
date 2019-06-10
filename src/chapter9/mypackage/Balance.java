package chapter9.mypackage;

/**
 * Программа демонстрирующая, класс Balance, его конструктор и метод show() является открытым.
 * Это означает, что запределами своего пакета они доступны из кода классов, не производных от классов и их пакета
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class Balance {

    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void  show(){
        if (bal < 0)
            System.out.print("---> ");
        System.out.println(name + ": $" + bal);
    }
}
