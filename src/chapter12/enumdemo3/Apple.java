package chapter12.enumdemo3;

/**
 * Программа демонстрирующая, использование конструктора
 * переменную эекземпляра, и метод перечисления.
 *
 * @author Ломовской К.Ю.
 * @since 15.06.2019
 */
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(15), Cortland(8);

    private int price;  // Цена на яблоки

    // Конструктор
    Apple(int p){
        price = p;
    }

    int getPrice(){
        return price;
    }
}
