package Seminar_04.gb_collections.lists;

import java.util.Iterator;

import Seminar_04.gb_collections.GbList;
import Seminar_04.gb_collections.lists.util.ArrayIterator;

public class GbArrayList<E> implements GbList<E> {

    private E[] values;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GbArrayList() {
        this.size = 0;
        this.capacity = 10;
        try {

        this.values = (E[]) new Object[capacity];

        } catch (ClassCastException e) {
            System.out.println(e.getMessage());    
        }
    }

    private void addCapacity() {
        capacity = capacity + capacity / 2;
        E[] array = (E[]) new Object[capacity];

    }


    @Override
    public void add(E value) {

        
    }

    @Override
    public void add(int index, E value) {
        
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void remove(E value) {

        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void remove(int index) {

        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        return size;

    }


    @Override
    public Iterator<E> iterator() {

        return new ArrayIterator<>(values);
    }
    
}
