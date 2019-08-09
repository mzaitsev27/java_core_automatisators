package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework;

import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.author.Author;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.Book;

public final class Storage {
    public static final int CAPACITY = 10;
    public static Book[] books = new Book[CAPACITY];
    public static int bookIndex = 0;

    private Storage() {
    }

    public static void increaseBookIndex() {
        bookIndex++;
    }

    public static Author[] authors = new Author[CAPACITY];
    public static int authorIndex = 0;

    public static void increaseAuthorIndex() {
        authorIndex++;
    }

    public static void increaseAuthorsStorage() {

        Author[] authors = new Author[authorIndex + CAPACITY];
        //System.arraycopy();
        for (int i = 0; i < Storage.authors.length; i++) {
            authors[i] = Storage.authors[i];
        }

        Storage.authors = authors;
    }

    public static void addAuthor(Author author) {
        author.setId(System.currentTimeMillis());

        if (authorIndex % (CAPACITY) == 0 && authorIndex != 0) {
            increaseAuthorsStorage();
        } else {
            authors[authorIndex] = author;
        }

        Storage.increaseAuthorIndex();
    }
}
