package chapter8.access;

/**
 * Программа демонстрирующая, что в иерархии классов закрытые члены остаются
 * закрытыми а пределах своего класса. Эта программасодержит ошибку и
 * поэтому она не подлежит компиляции.
 *
 * @author Ломовской К.Ю.
 * @since 25.05.2019
 */
class Assecc {

    public static void main(String[] args) {

        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма расна " + subOb.total);
    }
}
