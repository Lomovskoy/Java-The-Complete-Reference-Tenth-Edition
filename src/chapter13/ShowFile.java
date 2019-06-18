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
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // Сначала убедимся, что имя файла указанно
        if (args.length != 1){
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Попытка открыть файла
        try {
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("Невозможно открыть файл");
            return;
        }

        // Теперь файл открыт и готов к стению
        // Далее из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Закрыть файл
        try {
            fin.close();
        }catch (IOException e){
            System.out.println("Ошибка закрытия файла");
        }
    }
}
