package com.xhu.Methods;

public class Node1<E> {
    public E data;//�洢����
    public Node1 next;

    public Node1(E data) {
        this.data = data;
    }

    public Node1(E data, Node1 next) {
        this.data = data;
        this.next = next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
}
