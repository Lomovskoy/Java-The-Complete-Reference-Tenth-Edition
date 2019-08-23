package chapter18.clonedemo2;

/**
 * Класс демонстрирующий переопределение метода clone().
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class TestClone implements Cloneable{

    int a;
    double b;

    // Метод clone() переопределяется перерь как public
    public Object clone(){
        try {
            // Вызвать метод clone() из класса Object
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Клонирование невозможно.");
            return this;
        }
    }
}
