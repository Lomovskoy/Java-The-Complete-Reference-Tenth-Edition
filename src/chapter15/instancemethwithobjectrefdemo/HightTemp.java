package chapter15.instancemethwithobjectrefdemo;

/**
 * Класс демонстрирующий хранение
 * максимальной температуры за день.
 *
 * @author Ломовской К.Ю.
 * @since 21.07.2019
 */
class HightTemp {

    private int hTemp;

    HightTemp(int ht){ hTemp = ht; }

    /*
        Возвратит логическое значение true, если
        вызывающий обьект типа HightTemp содержит
        такую же температуру, как и у объекта ht2
     */
    boolean sameTemp(HightTemp ht2){
        return hTemp == ht2.hTemp;
    }

    /*
        Возвратит логическое значение true, если
        вызывающий обьект типа HightTemp содержит
        меньшую температуру, как и у объекта ht2
     */
    boolean lessThanTemp(HightTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
