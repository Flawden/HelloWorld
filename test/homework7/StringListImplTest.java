package homework7;

import com.flawden.module2.homework7.StringListImpl;
import org.junit.jupiter.api.Assertions;

public class StringListImplTest {

    @org.junit.jupiter.api.Test
    public void add() {
        StringListImpl stringList = new StringListImpl();
        Assertions.assertEquals("pavel", stringList.add("pavel"));
        Assertions.assertEquals("pavel", stringList.add("pavel"));
        Assertions.assertEquals("pavel", stringList.add("pavel"));
        Assertions.assertEquals("pavel", stringList.add("pavel"));
    }

    @org.junit.jupiter.api.Test
    public void addByIndex() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("pavel");
        stringList.add("pavel");
        stringList.add(3, "VOVA");
        Assertions.assertEquals("VOVA", stringList.get(3));
        Assertions.assertEquals(4, stringList.size());
    }

    @org.junit.jupiter.api.Test
    public void set() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("pavel");
        stringList.add("pavel");
        stringList.set(2, "VOVA");
        Assertions.assertEquals("VOVA", stringList.get(2));
        Assertions.assertEquals(3, stringList.size());
    }

    @org.junit.jupiter.api.Test
    public void setWithException() {
        StringListImpl stringList = new StringListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.set(13, "VOVA"));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void addByIndexWithException() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("pavel");
        stringList.add("pavel");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.add(13, "VOVA"));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void get() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        Assertions.assertEquals("pavel", stringList.get(0));
        stringList.add("gavel");
        Assertions.assertEquals("gavel", stringList.get(1));
    }

    @org.junit.jupiter.api.Test
    public void remove() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        Assertions.assertEquals("gavel", stringList.get(1));
        Assertions.assertEquals("gavel", stringList.remove("gavel"));
        Assertions.assertEquals("bavel", stringList.get(1));
        Assertions.assertEquals("pavel", stringList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void removeWithException() {
        StringListImpl stringList = new StringListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.remove("gavel"));
        Assertions.assertEquals("Элемент с указанным значением не найден.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void removeByIndex() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        Assertions.assertEquals("gavel", stringList.get(1));
        Assertions.assertEquals("gavel", stringList.remove(1));
        Assertions.assertEquals("bavel", stringList.get(1));
        Assertions.assertEquals("pavel", stringList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void removeByIndexWithException() {
        StringListImpl stringList = new StringListImpl();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.remove(1));
        Assertions.assertEquals("В массиве отсутствует элемент с данным индексом.", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void contains() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        Assertions.assertTrue(stringList.contains("gavel"));
        Assertions.assertFalse(stringList.contains("Гидрофазмотрон"));
    }

    @org.junit.jupiter.api.Test
    public void indexOf() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        Assertions.assertEquals(0, stringList.indexOf("pavel"));
        Assertions.assertEquals(1, stringList.indexOf("gavel"));
        Assertions.assertEquals(2, stringList.indexOf("bavel"));
        Assertions.assertEquals(-1 , stringList.indexOf("Гидрофазмотрон"));
    }

    @org.junit.jupiter.api.Test
    public void lastIndexOf() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        Assertions.assertEquals(0, stringList.indexOf("pavel"));
        Assertions.assertEquals(1, stringList.indexOf("gavel"));
        Assertions.assertEquals(2, stringList.indexOf("bavel"));
        Assertions.assertEquals(-1 , stringList.lastIndexOf("Гидрофазмотрон"));
    }

    @org.junit.jupiter.api.Test
    public void equals() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("pavel");
        stringList.add("gavel");
        stringList.add("bavel");
        StringListImpl stringList2 = new StringListImpl();
        stringList2.add("pavel");
        stringList2.add("gavel");
        stringList2.add("bavel");
        StringListImpl stringList3 = new StringListImpl();
        stringList3.add("pavel");
        stringList3.add("bavel");
        Assertions.assertTrue(stringList.equals(stringList2));
        Assertions.assertFalse(stringList.equals(stringList3));
    }

}
