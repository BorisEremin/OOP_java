package Seminar_04.gb_collections.lists.util;

public class Node<E> {
    public E value;
    public Node<E> next;
    public Node<E> prev;

    public Node(Node<E> prev, E value, Node<E> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}
