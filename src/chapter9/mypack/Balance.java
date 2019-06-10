package chapter9.mypack;

/**
 * Программа демонстрирующая,
 * создание простого пакета.
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
