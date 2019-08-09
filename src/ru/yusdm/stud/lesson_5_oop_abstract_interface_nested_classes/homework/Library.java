package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework;

import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.author.Author;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.Book;

import static ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.Storage.*;

public class Library {

    public void addAuthor(Author author) {
       Storage.addAuthor(author);
    }

    public void addBook(Book book) {
        books[bookIndex] = book;
        increaseBookIndex();
    }

    public void printBooks() {
        for (int i = 0; i < Storage.books.length; i++) {

            Book book = Storage.books[i];
            if (book != null) {
                System.out.println(getBookAsStr(book));
            }

        }
    }

    private String getBookAsStr(Book book) {
        return book.toString();
    }

    public void printAuthors() {
        for (int i = 0; i < authors.length; i++) {

            Author author = authors[i];
            if (author != null) {
                System.out.println(getAuthorAsStr(author));
            }

        }
    }

    private String getAuthorAsStr(Author author) {
        return author.toString();
    }

}
