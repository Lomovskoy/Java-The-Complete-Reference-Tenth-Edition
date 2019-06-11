package chapter9.myif;

/**
 * Программа демонстрирующая,
 * интерфейс с методами по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
class MyIfImpl2 implements MyIf {

    // В этом класса предсотавлена реалихация всех методов
    public int getNumber() {
        return 100;
    }

    public String gerString(){
        return "Это другая символьная строка";
    }
}
