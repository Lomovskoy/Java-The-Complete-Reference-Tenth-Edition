package chapter30.rmi;

import java.rmi.Naming;

/**
 * В этой программе демонстрируется простое приложение
 * "криент-сервер" использующее технологию RMI.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class AddClient {

    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

            System.out.println("Первое число: "  + args[1]);
            double d1 = Double.parseDouble(args[1]);
            System.out.println("Второе число: "  + args[2]);
            double d2 = Double.parseDouble(args[2]);

            System.out.println("Сумма: " + addServerIntf.add(d1, d2));
        } catch (Exception e){
            System.out.println("Исключение: " + e);
        }
    }
}
