package chapter18;

/**
 * Класс демонстрирующий применение методов
 * totalMemory(), freeMemory() и gc().
 *
 * @author Ломовской К.Ю.
 * @since 21.08.2019
 */
class MemoryDemo {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someInts = new Integer[1000];

        System.out.println("Всего памяти: " + r.totalMemory());
        mem1 = r.freeMemory();

        System.out.println("Свободной памяти исходно: " + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Свободной памяти после очистки: " + mem1);

        // Выделим память для объектов типа Integer
        for (int i = 0; i < 1000; i++)
            someInts[i] = new Integer(i);

        mem2 = r.freeMemory();
        System.out.println("Свободной памяти после выделения: " + mem2);
        System.out.println("Использованно памяти для выделения: " + (mem1 - mem2));

        // Обнулить объекты типа Integer
        for (int i = 0; i < 1000; i++)
            someInts[i] = null;

        // Запустить сборку мусора
        r.gc();
        mem2 = r.freeMemory();
        System.out.println("Свободной памяти после очистки обнулённых объектов типа Integer: " + mem2);
    }
}
