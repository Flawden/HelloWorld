package com.flawden.module1.homework13;

import com.flawden.module1.homework12.Author;
import com.flawden.module1.homework12.Book;

public class Main {

    /*
    Задание
    Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы
    создали на прошлом уроке.
    Обратите внимание, что toString книги не должен дублировать код из toString
    автора, а должен делегировать (вызывать) его версию метода.
     */

    public static void main(String[] args) {
        Author arthur  = new Author("Arthur", "Weasley");
        Author richard = new Author("Richard", "Bach");
        Book nonExistentBook = new Book("A non-existent book", arthur, 1990);
        Book seagull = new Book("Jonathan Livingston Seagull", richard, 1970);

        System.out.println(arthur);
        System.out.println(richard);
        System.out.println(nonExistentBook);
        System.out.println(seagull);
    }

}
