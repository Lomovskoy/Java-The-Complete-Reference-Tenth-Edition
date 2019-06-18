package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Программа демонстрирующая, копирование файла.
 * Что бы воспользоваться это программой, укажите
 * имена исходного и целевого файлов.
 * Например, чтобы скопировать файл first.txt
 * в файл second.txt
 *
 * @author Ломовской К.Ю.
 * @since 18.06.2019
 */
class CopyFile {

    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Сначала убедимся что именя файлов указанны
        if (args.length != 2){
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Копировать файл
        try {
            // Попытаться открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }finally {
            try {
                if (fin != null) fin.close();
            }catch (IOException e){
                System.out.println("Ошибка в закрытии файла ввода");
            }
            try {
                if (fout != null) fout.close();
            }catch (IOException e){
                System.out.println("Ошибка в закрытии файла вывода");
            }
        }
    }
}
