package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Программа демонстрирующая, оператор try с ресурками,
 * для автоматического закрытия файла.
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class ShowFile3 {

    public static void main(String[] args) {
        int i;

        // Сначала убедимся, что имя файла указанно
        if (args.length != 1){
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Ниже оператор try с ресурсами применяется
        // сначала для открытия, а затем для автоматического
        // закрытия файла по завершении блока этого оператора.
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
