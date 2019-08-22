package chapter18;

/**
 * Класс демонстрирующий ожидание
 * завершения текстового редоктора Notepad.
 *
 * @author Ломовской К.Ю.
 * @since 22.08.2019
 */
class ExecDemoFini {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
            p.waitFor();
        }catch (Exception e){
            System.out.println("Ошибка запуска Notepad");
        }

        System.out.println("Редактор Notepad возвратил " + p.exitValue());

    }
}
