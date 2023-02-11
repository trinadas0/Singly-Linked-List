public class LinkedList<T> { // LinkedList of any type
    Node<T> head; // object node head
    Node<T> tail; // object node tail
    private int size;

    public void addFirst(T data) { // add a node onto the front of the LinkedList, used in stacks
        Node<T> newNode = new Node<>(data); 
        newNode.next = head; // links new head to old head
        head = newNode; // new head
        size++;
        if (tail == null) { // if there is no other Node
            tail = head;
        }
    }

    public void addLast(T data) { // add a node onto the end of the LinkedList, used in queues
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } 
        
        else {
            tail.next = newNode; // links newNode to tail
            tail = newNode; // newNode becomes tail
        }
        size++;
    }

    public T getFirst() {
        if (head == null) { // if there is no head (empty)
            return null;
        }
        return head.data; // data is a variable in the Node class
    }

    public T getLast() {
        if (tail == null) { // if there is no tail (empty)
            return null;
        }
        return tail.data; 
    }

    public T removeFirst() {
        if (head == null) {sadfer
            return null;
        }
        T data = head.data; // data in old head node
        head = head.next; // head becomes the next node
        size--;
        if (head == null) { // if that was the last node and list is now empty
            tail = null; 
        }
        return data; // returns old head data
    }

    public T removeLast() {
        if (tail == null) { // if empty
            return null;
        }
        T data = tail.data;
        if (head == tail) { // if there is only one Node
            head = tail = null;
        } 
        
        else {
            Node<T> current = head; // we start at head node
            while (current.next != tail) { // we iterate through the nodes until we get to the tail
                current = current.next;
            }
            current.next = null; // remove old tail
            tail = current; // current becomes new tail
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList(Node node) {
        if (node == null) { // if we get to the end of the list
            return; // end the recursion
        }
        System.out.print(node.data + " ");
        printList(node.next); // call function for next node
    }

    public static void main(String []args) {
    }
}
