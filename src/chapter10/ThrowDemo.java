package chapter10;

/**
 * Программа демонстрирующая,
 * применение оператора throw.
 *
 * @author Ломовской К.Ю.
 * @since 12.06.2019
 */
class ThrowDemo {

    static void demoProc() {
        try {
            throw new NullPointerException("Демонстрация");
        }catch (NullPointerException e){
            System.out.println("Исключение перехваченно в теле метода demoProc()");
            throw e;    // Повторне сгенерированно исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват: " + e);
        }
    }
}
