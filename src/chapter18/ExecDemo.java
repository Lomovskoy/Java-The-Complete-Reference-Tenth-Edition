package chapter18;

/**
 * Класс демонстрирующий применение метода exec().
 *
 * @author Ломовской К.Ю.
 * @since 22.08.2019
 */
class ExecDemo {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
        }catch (Exception e){
            System.out.println("Ошибка запуска Notepad");
        }
    }
}
