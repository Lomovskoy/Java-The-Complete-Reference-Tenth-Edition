package chapter18.clonedemo;

/**
 * Класс демонстрирующий применение метода clone().
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class TestClone implements Cloneable{

    int a;
    double b;

    // В этом методе вызывается метод clone() из класса Object
    TestClone cloneTest(){
        try {
            // Вызвать метод clone() из класса Object
            return (TestClone) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Клонирование невозможно");
            return this;
        }
    }
}
