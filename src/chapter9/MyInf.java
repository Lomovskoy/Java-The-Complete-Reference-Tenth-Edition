package chapter9;

/**
 * Программа демонстрирующая,
 *статических методов по умолчанию.
 *
 * @author Ломовской К.Ю.
 * @since 10.06.2019
 */
public interface MyInf {

    // Это объявления обычного метода в интефейсе.
    // Он не предсотавляет реализацию по умолчанию
    int getNumber();

    // Это объявление метода с реализацией по умолчанию.
    // Обратите внимание на его реализацию по умолчанию
    default String getString(){
        return "Объект типа String по умолчанию";
    }

    // Это объявление статического метода в интерфейсе
    static int getDefoultNumber(){
        return 0;
    }
}
