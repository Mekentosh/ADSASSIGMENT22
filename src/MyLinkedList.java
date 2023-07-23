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
    @Override
    public void add(E element){
        Node newNode = new Node(element, null, tail);
        if (tail == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    public void checkIndex(int index){
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public E get(int index){
        checkIndex(index);

        Node current;
        if (index <= size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }
    @Override
    public E remove(int index){
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
        return current.element;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void add(E item, int index) {
        checkIndex(index);

        Node newNode = new Node(item, null, null);

        if (size == 0) {
            head = tail = newNode;
        }
        else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node prevNode = current.prev;
            newNode.prev = prevNode;
            newNode.next = current;
            prevNode.next = newNode;
            current.prev = newNode;
        }

        size++;
    }
    @Override
    public boolean remove(E item) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                }
                else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public void clear() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.element = null;
            current.next = null;
            current.prev = null;
            current = next;
        }
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void sort() {
        if (head != null) {
            Node current = null,
                    new_head = null,
                    move_node = null,
                    prev = null;
            while (head != null) {
                prev = null;
                current = head;
                move_node = head;
                while (current != null) {
                    if (current.next != null && ((Comparable<E>) current.next.element).compareTo(move_node.element) > 0) {
                        move_node = current.next;
                        prev = current;
                    }
                    current = current.next;
                }
                if (move_node == head) {
                    head = (head).next;
                }
                if (prev != null) {
                    prev.next = move_node.next;
                }
                move_node.next = new_head;
                new_head = move_node;
            }
            head = new_head;
        } else {
            System.out.println("Empty Linked list");
        }
    }
    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        Node current = tail;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void deleteDuplicates(){
        System.out.println("No method was implemented yet");
    }


}
