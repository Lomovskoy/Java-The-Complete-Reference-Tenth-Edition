package chapter22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Класс демонстрирующий запись данных
 * в файл средствами системы ввода-вывода NIO.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class ExplicitChannelWrite {

    public static void main(String[] args) {

        // Получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test8.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)){

            // Создать буфер
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            // Записать некоторое количество байтов в буфер
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

            // Подготовить буфер к записи данных
            mBuf.rewind();

            // Записать данные из буфера в выходной файл
            fChan.write(mBuf);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

    }
}
