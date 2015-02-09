package com.datastructure;

import com.dto.Node;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public class SinglyLinkList implements LinkedList<Node> {
    private Node head;
    private Node tail;

    @Override
    public void add(Node node) {
        Node newNode = new Node();
        newNode.setEmployee(node);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    @Override
    public void addAfter(Node node) {

    }

    @Override
    public void removeAfter(Node node) {

    }

    @Override
    public void removeFront(Node node) {

    }

    @Override
    public void traverse() {

    }
}
