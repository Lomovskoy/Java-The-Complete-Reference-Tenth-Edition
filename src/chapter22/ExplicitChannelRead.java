package chapter22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Класс демонстрирующий использование
 * канала ввода-вывода для чтения файла.
 *
 * @author Ломовской К.Ю.
 * @since 27.02.2020
 */
public class ExplicitChannelRead {

    public static void main(String[] args) {
        int count;
        Path filePath = null;

        // Сначало получаем путь к файлу
        try {
            filePath = Paths.get("test6.txt");
        } catch (InvalidPathException e){
            System.out.println("Path error " + e);
        }

        // Затем получить канал к этому файлу в
        // блоке оператора try с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)){

            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {

                // Читать данные из файла в буфер
                count = fChan.read(mBuf);

                // Прекратить чтение по достижению конца файла
                if (count != -1){

                    // Подготовить буфер для чтения из него данных
                    mBuf.rewind();

                    // Читать байты данных из буфера и
                    // выводить их на эекран как символы
                    for (int i = 0; i < count; i++){
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);

            System.out.println();
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
