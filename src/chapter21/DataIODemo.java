package chapter21;

import java.io.*;

/**
 * Класс демонстрирующий использование
 * классов DataInputStream и DataOutputStream.
 *
 * @author Ломовской К.Ю.
 * @since 25.02.2020
 */
public class DataIODemo {

    public static void main(String[] args) {

        // Сначала ввести данный в файл
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test4.txt"))){
            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        // А теперь вывести данные из файла
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test4.txt"))){
            double d = dataInputStream.readDouble();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();
            System.out.println("Полученные значения: " + d + " " + i + " " + b);
        }catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода");
            return;
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
