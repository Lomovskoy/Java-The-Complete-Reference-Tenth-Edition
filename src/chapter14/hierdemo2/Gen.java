package chapter14.hierdemo2;

/**
 * Класс демонстрирующий, что не обощённый
 * класс может служить суперклассом для обощённого
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class Gen<T> extends NonGen{

    T ob;

    // Передаём контруктору ссылку на объект типа Т
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    // Возвратить объект ob
    T getOb(){
        return ob;
    }

}
