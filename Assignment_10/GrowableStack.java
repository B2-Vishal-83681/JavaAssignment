import java.util.EmptyStackException;

public class GrowableStack<T> implements Stack<T> {
    private T[] stackArray;
    private int top;
    private static final int GROW_FACTOR = 2;

    public GrowableStack() {
        stackArray = (T[]) new Object[Stack.STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(T emp) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = emp;
        } else {
            T[] newArray = (T[]) new Object[top * GROW_FACTOR + Stack.STACK_SIZE];
            System.arraycopy(stackArray, 0, newArray, 0, top + 1);
            stackArray = newArray;
            stackArray[++top] = emp;
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
