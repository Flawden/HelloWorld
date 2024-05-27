package com.flawden.module2.homework7;

import java.util.Arrays;
import java.util.Objects;

public class StringListImpl implements StringList, java.io.Serializable {

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
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом. ");
        }
        if (size + 1 >= strings.length) {
            grow();
        }
        for (int i = size; i >= index; i--) {
            strings[i + 1] = strings[i];
        }
        strings[index] = item;
        size++;
        return strings[index];
    }

    @Override
    public String set(int index, String item) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом. ");
        }
        strings[index] = item;
        size++;
        return strings[index];
    }

    @Override
    public String remove(String item) {
        boolean isFinding = false;
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                for (int j = i; j <= size; j++) {
                    strings[j] = strings[j + 1];
                }
                isFinding = true;
                break;
            }
        }
        if (isFinding) {
            size--;
            return item;
        }
        throw new IllegalArgumentException("Элемент с указанным значением не найден.");
    }

    @Override
    public String remove(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом. ");
        }
        String item = strings[index];
        for (int i = index; i < size; i++) {
            strings[i] = strings[i + 1];
        }
        return item;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (strings[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("В массиве отсутствует элемент с данным индексом.");
        }
        return strings[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new NullPointerException("Ошибка! Вместо массива пришел какой-то Null. Мы такое не любим.");
        }
        if (otherList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!otherList.get(i).equals(strings[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) {
            return false;
        }
        return true;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            strings[i] = null;
        }
        size = 0;
    }

    @Override
    public String[] toArray() {
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = strings[i];
        }
        return stringArray;
    }

    @Override
    public String toString() {
        return "StringListImpl{" +
                "size=" + size +
                ", strings=" + Arrays.toString(strings) +
                '}';
    }
}
