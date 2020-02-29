package chapter22;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Класс демонстрирующий использование
 * изображение для чтения данных из файла.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class MappedChannelRead {

    public static void main(String[] args) {

        // Получить канал к файлу в блоке
        // оператора try с ресурсами
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test7.txt"))){

            // Получить размер файла
            long fSize = fChan.size();

            // Теперь отобразить файл в буфер
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // Читать айлы из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++)
                System.out.println((char) mBuf.get());

            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
