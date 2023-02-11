class Node<T> {
    T data; // value inside node
    Node<T> next; // next node in list

    public Node(T data) {
        this.data = data;
        next = null;
    }
}
