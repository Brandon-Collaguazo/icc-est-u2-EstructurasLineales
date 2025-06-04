package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;

public class ColaG <T> {
    
    private int size;
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;

    public ColaG() {
        this.primero =null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if(isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if(isEmpty())
            throw new EmptyStackException();
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return primero.getValue();
    }

    public void printColaG() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue() + " | ");
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }
}
