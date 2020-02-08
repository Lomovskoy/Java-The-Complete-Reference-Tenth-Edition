package chapter19;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Класс демонстрирующий применение
 * класса Stack.
 *
 * @author Ломовской К.Ю.
 * @since 08.02.2020
 */
public class StackDemo {

    static void showPush(Stack<Integer> stack, int element){
        stack.push(element);
        System.out.println("push(" + element + ")");
        System.out.println("Стек: " + stack);
    }

    static void showPop(Stack<Integer> stack){
        System.out.print("pop -> ");
        int element = stack.pop();
        System.out.println(element);
        System.out.println("Стек: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Стек: " + stack);

        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 99);

        showPop(stack);
        showPop(stack);
        showPop(stack);

        try {
            showPop(stack);
        }catch (EmptyStackException ex){
            System.out.println("Стек пуст");
        }
    }
}
