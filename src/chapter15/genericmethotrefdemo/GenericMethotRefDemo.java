package chapter15.genericmethotrefdemo;

/**
 * Класс демонстрирующий применение ссылки на обощённый
 * метод, объявленный в необощённом классе.
 *
 * @author Ломовской К.Ю.
 * @since 27.07.2019
 */
class GenericMethotRefDemo {

    /*
        В качестве первого пе=араметра этого метода
        указывается функциональный интерфейс MyFunc,
        а в какчестве двух других параметров - массив и
        значение, причеём оба тип Т
     */
    static <T> int myOp(MyFunc<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {

        Integer[] vals = {1, 2, 3, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatChild, vals, 4);
        System.out.println("Массив vals содержит " + count + " чсисла четырк");

        count = myOp(MyArrayOps::<String>countMatChild, strs, "Два");
        System.out.println("Массив strs содержит " + count + " чсисла два");
    }
}
