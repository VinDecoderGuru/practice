package com.dto;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public class Node<T> {
    private T employee;
    private Node<T> next;
    private Node<T> prev;

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
