package lab6;

import java.util.EmptyStackException;

class Stack<T> {
    private T[] data;
    private int top;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T element) {
        if (top == data.length - 1) {
            throw new StackOverflowError("Stack переполнен");
        }
        data[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

}

public class UseOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());
    }
}