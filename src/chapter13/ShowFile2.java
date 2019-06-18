package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Программа демонстрирующая, отображение содержимого файла,
 * Что бы воспользоваться этой программой, укажите имя файла,
 * который требуется посмотреть. Например, что бы посмотреть
 * файл test.txt, введите в командной строке следующую команду:
 * java ShowFile test.txt
 * В этой программекод, открывающицй и получающий доступ к файлу,
 * заключён в один блок оператора try. Файл закрывается в блоке
 * оператора finaly
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
class ShowFile2 {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Сначала убедимся, что имя файла указанно
        if (args.length != 1){
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // В следующем фрагменте кода сначала открывается файл,
        // а затем из него читаются символы до тех пор, пока
        // не встретится признак конца файла
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }finally {
            // Закрыть файл
            try {
                if (fin != null) fin.close();
            }catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
