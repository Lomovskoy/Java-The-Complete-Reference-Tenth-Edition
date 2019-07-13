package chapter14.hierdemo2;

/**
 * Класс демонстрирующий, что не обощённый
 * класс может служить суперклассом для обощённого
 *
 * @author Ломовской К.Ю.
 * @since 13.07.2019
 */
class HierDemo2 {

    public static void main(String[] args) {

        Gen<String> w = new Gen<String>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
