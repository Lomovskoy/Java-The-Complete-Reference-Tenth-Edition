package chapter21;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Класс демонстрирующий использование
 * буферезированного ввода.
 *
 * @author Ломовской К.Ю.
 * @since 23.02.2020
 */
public class BufferInputStreamDemo {

    public static void main(String[] args) {

        String s = "Это знак авторского права &copy; , а &copy нет.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        // Использовать оператор try с ресурсами
        // для управления файлами
        try (BufferedInputStream f = new BufferedInputStream(in)){
            while ((c = f.read()) != -1){
                switch (c){
                    case '&':
                        if (!marked){
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
