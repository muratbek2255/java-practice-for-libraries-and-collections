package stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    static void showPush(Stack<Integer> st, int a) {
        System.out.println("push(" + a + ")");
        System.out.println("стек: " + st);
    }

    static void pop(Stack<Integer> st) {
        System.out.println("pop ->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) throws EmptyStackException {
        Stack<Integer> st = new Stack<>();

        System.out.println("stack: " + st);

        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        pop(st);
        pop(st);
        pop(st);

        st.pop();

    }
}
