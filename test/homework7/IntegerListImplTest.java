package homework7;

import com.flawden.module2.homework7.StringListImpl;
import com.flawden.module2.homework8.IntegerListImpl;
import org.junit.jupiter.api.Assertions;

public class IntegerListImplTest {

    @org.junit.jupiter.api.Test
    public void add() {
        IntegerListImpl integerList = new IntegerListImpl();
        Assertions.assertEquals(1, integerList.add(1));
        Assertions.assertEquals(2, integerList.add(2));
        Assertions.assertEquals(3, integerList.add(3));
        Assertions.assertEquals(4, integerList.add(4));
    }

    @org.junit.jupiter.api.Test
    public void addByIndex() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3, 4);
        Assertions.assertEquals(4, integerList.get(3));
        Assertions.assertEquals(4, integerList.size());
    }

    @org.junit.jupiter.api.Test
    public void set() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.set(2, 22);
        Assertions.assertEquals(22, integerList.get(2));
        Assertions.assertEquals(3, integerList.size());
    }

    @org.junit.jupiter.api.Test
    public void setWithException() {
        IntegerListImpl integerList = new IntegerListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> integerList.set(13, 444));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void addByIndexWithException() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> integerList.add(13, 444));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void get() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        Assertions.assertEquals(1, integerList.get(0));
        integerList.add(2);
        Assertions.assertEquals(2, integerList.get(1));
    }

    @org.junit.jupiter.api.Test
    public void remove() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assertions.assertEquals(2, integerList.get(1));
        Assertions.assertEquals(3, integerList.remove(2));
        Assertions.assertEquals(3, integerList.get(1));
        Assertions.assertEquals(1, integerList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void removeWithException() {
        IntegerListImpl integerList = new IntegerListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> integerList.remove(444));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void removeByIndex() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assertions.assertEquals(2, integerList.get(1));
        Assertions.assertEquals(2, integerList.remove(1));
        Assertions.assertEquals(3, integerList.get(1));
        Assertions.assertEquals(1, integerList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void removeByIndexWithException() {
        IntegerListImpl integerList = new IntegerListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> integerList.remove(1));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void contains() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assertions.assertTrue(integerList.contains(2));
        Assertions.assertFalse(integerList.contains(444));
    }

    @org.junit.jupiter.api.Test
    public void indexOf() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assertions.assertEquals(0, integerList.indexOf(1));
        Assertions.assertEquals(1, integerList.indexOf(2));
        Assertions.assertEquals(2, integerList.indexOf(3));
        Assertions.assertEquals(-1 , integerList.indexOf(444));
    }

    @org.junit.jupiter.api.Test
    public void lastIndexOf() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assertions.assertEquals(0, integerList.lastIndexOf(1));
        Assertions.assertEquals(1, integerList.lastIndexOf(2));
        Assertions.assertEquals(2, integerList.lastIndexOf(3));
        Assertions.assertEquals(-1 , integerList.lastIndexOf(444));
    }

    @org.junit.jupiter.api.Test
    public void equals() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IntegerListImpl integerList2 = new IntegerListImpl();
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(3);
        IntegerListImpl integerList3 = new IntegerListImpl();
        integerList3.add(2);
        integerList3.add(1);
        Assertions.assertTrue(integerList.equals(integerList2));
        Assertions.assertFalse(integerList.equals(integerList3));
    }

}
