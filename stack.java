public class stack<T> {
    private LinkedList<T> s = new LinkedList<>();

    public void push(T data) { // LIFO, so adds nodes onto the front of the LinkedList
        s.addFirst(data);
    }

    public T pop() { // LIFO, so removes from the front of the LinkedList
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return s.removeFirst();
    }

    public T top() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return s.getFirst();
    }

    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public static void main(String []args) {
     }
}


 