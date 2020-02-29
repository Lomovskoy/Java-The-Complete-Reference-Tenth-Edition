package chapter22;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Класс демонстрирующий запись
 * данных в сопоставляемый файл.
 *
 * @author Ломовской К.Ю.
 * @since 29.02.2020
 */
public class MappedChannelWrite {

    public static void main(String[] args) {

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test9.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)){

            // Затем сопоставим файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // Записать данное количество байтов в буфер
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
