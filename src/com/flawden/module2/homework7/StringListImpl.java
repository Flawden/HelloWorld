package com.flawden.module2.homework7;

import java.util.RandomAccess;

public class StringListImpl implements StringList, RandomAccess, Cloneable, java.io.Serializable {

    @java.io.Serial
    private static final long serialVersionUID = 1238219132;

    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    transient String[] strings;

    public StringListImpl() {
        this.strings = new String[DEFAULT_CAPACITY];
    }

    public StringListImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.strings = new String[initialCapacity];
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    private void grow() {
        if (strings.length > 0) {
            this.strings = copyOf(this.strings, this.strings.length * 2);
        }  else {
            this.strings = copyOf(this.strings, this.strings.length + 1);
        }
    }

    private String[] copyOf(String[] oldStringArray, int newCapacity) {
        String[] newStringArray = new String[newCapacity];
        for (int i = 0; i < oldStringArray.length; i++) {
            newStringArray[i] = oldStringArray[i];
        }
        return newStringArray;
    }

    @Override
    public String add(String item) {
        while (size + 1 >= this.strings.length) {
            grow();
        }
        this.strings[size] = item;
        size++;
        return strings[size - 1];
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

    @Override
    public StringListImpl clone() {
        try {
            StringListImpl clone = (StringListImpl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
