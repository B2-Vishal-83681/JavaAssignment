import java.util.EmptyStackException;

public class FixedStack<T> implements Stack<T> {
    private final T[] stackArray;
    private int top;

    public FixedStack() {
        stackArray = (T[]) new Object[Stack.STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(T emp) {
        if (top < Stack.STACK_SIZE - 1) {
            stackArray[++top] = emp;
        } else {
            throw new RuntimeException("Stack is full.");
        }
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
