package chapter21.serializationdemo;

import java.io.*;

/**
 * Класс демонстрирующий применение
 * сериализации и десериализации.
 *
 * @author Ломовской К.Ю.
 * @since 26.02.2020
 */
public class SerializationDemo {

    public static void main(String[] args) {

        // Произвести серриализацию объекта
        try (ObjectOutputStream objOStream = new ObjectOutputStream(new FileOutputStream("serial"))){
            MyClass myClass1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("myClass1: " + myClass1);

            objOStream.writeObject(myClass1);
        } catch (IOException e){
            System.out.println("Исключение при сериализации");
        }

        // Произвести десерриализацию объекта
        try (ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream("serial"))){
            MyClass myClass2 = (MyClass)objIStream.readObject();
            System.out.println("myClass2: " + myClass2);
        } catch (Exception e){
            System.out.println("Исключение при десериализации");
            System.exit(0);
        }
    }
}
