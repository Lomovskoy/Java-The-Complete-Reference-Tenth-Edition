package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Программа демонстрирующая, применение
 * оператора try с ресурсами и управление
 * двумя ресурсами в одном операторе try
 *
 * @author Ломовской К.Ю.
 * @since 19.06.2019
 */
class CopyFile2 {

    public static void main(String[] args) throws IOException {
        int i;

        // Сначала убедимся что именя файлов указанны
        if (args.length != 2){
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Открыть файл и управлять им в операторе try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout =  new FileOutputStream(args[1])){
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
