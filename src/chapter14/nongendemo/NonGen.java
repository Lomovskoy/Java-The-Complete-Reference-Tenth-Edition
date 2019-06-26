package chapter14.nongendemo;

/**
 * Программа демонстрирующая, функциональный
 * эквивалент класса Gen без обощений.
 *
 * @author Ломовской К.Ю.
 * @since 26.06.2019
 */
class NonGen {

    // Объект ob теперь имеет тип Object
    Object ob;

    // Передать контруктору сслку на объект типа Object
    NonGen(Object o){
        ob = o;
    }

    // Возвратить объект типа Object
    Object getOb(){
        return ob;
    }

    // Показать тип объекта ob
    void showType(){
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}
