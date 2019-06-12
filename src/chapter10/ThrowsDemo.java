package chapter10;

/**
 * Программа демонстрирующая,
 * правильного перехвата исключения.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("Демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("Перехваченно исключение: " + e);
        }
    }
}
