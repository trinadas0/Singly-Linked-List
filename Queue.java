public class Queue<T> {
    LinkedList<T> list = new LinkedList<>(); // LinkedList based queue

    public void enqueue(T data) { // FIFO, so adds nodes onto end of LinkedList
        list.addLast(data);
    }

    public T dequeue() { // FIFO, so removes from the front of the LinkedList
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
        }
        return list.removeFirst();
    }

    public T front() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
        }
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printQueue(Node<T> node) {
        if (node == null) { // recursion continues until end of Queue
            System.out.print("\n");
            return;
        }
        System.out.print(node.data + " ");
        printQueue(node.next);
    }


    public static void main(String []args) {

    }
}
