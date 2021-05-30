import java.util.LinkedList;

class Stack<T> {
    private int head;
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
        head = -1;
    }

    public void push(T t) {
        ++head;
        stack.add(t);
    }

    public void pop() {
        stack.remove(head);
        --head;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public boolean contains(T o) {
        for (Object obj : stack) {
            if (obj.hashCode() == o.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public LinkedList<T> getStack() {
        return stack;
    }

    public void setStack(LinkedList<T> stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Stack = " + stack;
    }

}

