package com.datastructure;

/**
 * Created by vinay.pawar on 2/9/14.
 */
public interface LinkedList<T> {
    public void add(T node);
    public void addAfter(T node);
    public void removeAfter(T node);
    public void removeFront(T node);
    public void traverse();

}
