package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;
import models.Persona;

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

    public T findByName(String nombre) {
        NodeGeneric<T> current = primero;
        while(current != null) {
            Persona p = (Persona) current.getValue();
            if(p.getNombre().equalsIgnoreCase(nombre)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public T removeByName(String nombre) {
        if(isEmpty()) {
            return null;
        }
        Persona primeraPersona = (Persona) primero.getValue();
        if(primeraPersona.getNombre().equalsIgnoreCase(nombre)) {
            return remove();
        }
        NodeGeneric<T> anterior = primero;
        NodeGeneric<T> actual = primero.getNext();
        while(actual != null) {
            Persona personaActual = (Persona) actual.getValue();
            if(personaActual.getNombre().equalsIgnoreCase(nombre)) {
                anterior.setNext(actual.getNext());
                if(actual == ultimo) {
                    ultimo = anterior;
                }
                size--;
                return actual.getValue();
            }
            anterior = actual;
            actual = actual.getNext();
        }
        return null;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }
}
