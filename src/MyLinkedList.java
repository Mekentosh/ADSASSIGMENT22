public class MyLinkedList<E> implements MyList<E> {
    private class Node{
        E element;
        Node next;
        Node prev;
        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;
    private Node tail;
    private int size;

}
