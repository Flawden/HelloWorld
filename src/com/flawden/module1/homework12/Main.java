package com.flawden.module1.homework12;

public class Main {

    public static void main(String[] args) {
        Author arthur  = new Author("Arthur", "Weasley");
        Author richard = new Author("Richard", "Bach");
        Book nonExistentBook = new Book("A non-existent book", arthur, 1990);
        Book seagull = new Book("Jonathan Livingston Seagull", richard, 1970);
        nonExistentBook.setAge(1995);
    }

    /*
    Задание
    Напишите небольшой библиотечный справочник, где хранится информация о книгах.
    Рекомендуем создать отдельный класс, например с именем Main или App, в нем объявить
    метод main и в нем протестировать работу вашего кода.

    1. Создайте класс Book, который будет содержать в себе данные о названии, авторе и
    годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно: это
    String, Author и int.
    2. Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
    3. Напишите конструкторы для обоих классов, заполняющие все поля.
    4. Создайте геттеры для всех полей автора и всех полей книги.
    5. Создайте сеттер для поля «Год публикации» у книги.
    6. В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько
    объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы
    являются обязательными и книги не могут создаваться без авторов.
    Метод main не должен находиться в классах Book и Author.
    Создайте отдельный класс для запуска приложения и объявите метод main в нем.
    7. В том же методе main измените год публикации одной из книг с помощью сеттера.
    Теперь, когда вы изучили геттеры и сеттеры, не оставляйте поля открытыми — то есть без
    модификатора доступа private.
     */


}
