package chapter39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В этом классе демонстрируется применение
 * документирующих комментариев
 * @author Ломовской Кирилл
 * @version 1.0
 */
public class SquareNum {

    /**
     * Этот метод возвращает квадрат числа.
     * @param num  - значение возводимое в квадрат
     * @return num - квадрат вводимого числа
     */
    public double square(double num){
        return num * num;
    }

    /**
     * Этот метод вводит число, заданное пользхователем
     * @return введённое значение типа double
     * @exception IOException если при вводе возникает ошибка то, генерируется исключение
     * @see IOException
     */
    public double getNumber() throws IOException {
        // Создать буферизированный поток чтения
        // типа BufferedReader, используя стундартный
        // поток ввода System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str = inData.readLine();
        return  Double.parseDouble(str);
    }

    /**
     * В этом методе демонстрируется примсенение метоа square()
     * @param args - не используется
     * @exception IOException если при вводе возникает ошибка то, генерируется исключение
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Ввесдит значение для возведения в квадрат");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Квадрат значения равен " + val);
    }
}
