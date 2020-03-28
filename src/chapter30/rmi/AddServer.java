package chapter30.rmi;

import java.rmi.Naming;

/**
 * В этой программе демонстрируется простое приложение
 * "криент-сервер" использующее технологию RMI.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class AddServer {

    public static void main(String[] args) {
        try {
            AddServerImpl addServer = new AddServerImpl();
            Naming.rebind("AddServer", addServer);
        } catch (Exception e){
            System.out.println("Исключение: " + e);
        }
    }
}
