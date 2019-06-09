package chapter8.demoshipment;

/**
 * Программа демонстрирующая, расширение класса BoxWeight
 * включением в него поле стоимости доставки.
 *
 * @author Ломовской К.Ю.
 * @since 26.05.2019
 */
class DemoShipment {

    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объём shipment1 = " + vol);
        System.out.println("Вес shipment1 = " + shipment1.weight);
        System.out.println("Стоимость доставки = " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объём shipment2 = " + vol);
        System.out.println("Вес shipment2 = " + shipment2.weight);
        System.out.println("Стоимость доставки = " + shipment2.cost);
    }
}
