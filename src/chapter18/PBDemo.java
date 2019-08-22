package chapter18;

/**
 * Класс демонстрирующий применение ProcessBuilder().
 *
 * @author Ломовской К.Ю.
 * @since 22.08.2019
 */
class PBDemo {

    public static void main(String[] args) {

        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testFile");
            proc.start();
        }catch (Exception e){
            System.out.println("Ошибка запуска Notepad");
        }

    }
}
