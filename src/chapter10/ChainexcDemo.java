package chapter10;

/**
 * Программа демонстрирующая,
 * цепочску исключений.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
public class ChainexcDemo {

    static  void demoProc(){
        // Создать исключение
        NullPointerException e = new NullPointerException("Верхний урвоень");

        // Добавить причину исключения
        e.initCause(new ArithmeticException("Причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            // Вывести исключение верхнего уровня
            System.out.println("Перехваченно исключение: " + e);
            // Вывести исключение, послужившее пирчиной
            // для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
