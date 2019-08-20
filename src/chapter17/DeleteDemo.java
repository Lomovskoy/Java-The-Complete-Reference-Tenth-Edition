package chapter17;

/**
 * Класс демонстрирующий использование
 * метода delete() и deleteCharAt().
 *
 * @author Ломовской К.Ю.
 * @since 20.08.2019
 */
class DeleteDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Это простой тест.");

        sb.delete(3, 11);
        System.out.println("После вызова метода delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова метода deleteCharAt(): " + sb);
    }
}
