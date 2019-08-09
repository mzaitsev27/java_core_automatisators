package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework;

import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.author.Author;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.author.InputAuthor;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.Book;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.HandWrittenBook;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.InputBook;
import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.PrintedBook;

public class LibraryDemo {

    public static void main(String[] args) {
        Library library = new Library();

        initData(library);

        library.printAuthors();
        library.printBooks();
    }

    private static void initData(Library library) {
        InputBook inputBook1 = new InputBook();
        inputBook1.setName("Zolotaya rybka");
        inputBook1.setPublishYear(11);
        Book book1 = valueOfForHandWrittenBook(inputBook1);

        InputBook inputBook2 = new InputBook();
        inputBook2.setName("Rusla and Ludmila");
        inputBook2.setPublishYear(11);
        Book book2 = valueOfForHandWrittenBook(inputBook2);

        InputAuthor inputAuthor = new InputAuthor();
        inputAuthor.setLastName("Pushkin");
        inputAuthor.setYearOfBorn(22);
        Author author = valueOfForHandWrittenBook(inputAuthor);
        author.setBooks(new Book[]{book1, book2});

        book1.setAuthors(new Author[]{author});
        book2.setAuthors(new Author[]{author});


        library.addBook(book1);
        library.addBook(book2);

        library.addAuthor(author);
    }

    private static Book valueOfForHandWrittenBook(InputBook inputBook) {
        HandWrittenBook book = new HandWrittenBook();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        book.setPaint(inputBook.getPaint());

        return book;
    }

    private static Book valueOfForPrintedBook(InputBook inputBook) {
        PrintedBook book = new PrintedBook();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        book.setFontFamily(inputBook.getFontFamily());

        return book;
    }

    private static Author valueOfForHandWrittenBook(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setLastName(inputAuthor.getLastName());
        return author;
    }
}
