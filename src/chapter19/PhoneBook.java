package chapter19;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Properties;

/**
 * Класс демонстрирующий простую базу данных телефонных номеров,
 * построенную на использовании списка свойств.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class PhoneBook {

    public static void main(String[] args) throws IOException {

        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Попытка открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException e){
            // Игнорировать отсутствующий файл
        }

        // Если телефонная книга уже существует,
        // загрузить существующие номера
        try {
            if (fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch (IIOException e){
            System.out.println("Ошибка чтения файла");
        }

        // Разрешить пользователю вводить новые
        // именя и номера телефонов абонентов.
        do {
            System.out.println("введите имя ('выход' для завершения)");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        // Сохранить телефонную книгу, есди она изменилась
        if (changed){
            FileOutputStream font = new FileOutputStream("phonebook.dat");
            ht.store(font, "Телефонная книга");
            font.close();
        }

        // Искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска ('выход' для завершения)");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
