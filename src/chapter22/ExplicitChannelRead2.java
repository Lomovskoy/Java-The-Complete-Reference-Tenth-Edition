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
 * компактного способа открытия канала.
 *
 * @author Ломовской К.Ю.
 * @since 27.02.2020
 */
public class ExplicitChannelRead2 {

    public static void main(String[] args) {
        int count;

        // Здесь канал открывается по пути, возвращаемому
        // методом Path.get() в виде объекта Path
        // Переменная filepath больше не нужна.
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test7.txt"))){

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
        } catch (InvalidPathException e){
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
