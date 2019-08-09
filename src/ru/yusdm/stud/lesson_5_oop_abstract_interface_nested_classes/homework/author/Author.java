package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.author;

import ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book.Book;

public class Author {

    private Long id;
    private String lastName;
    private String name;
    private int yearOfBorn;
    private Book[] books;

    public Author(Long id) {
        this.id = id;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                '}';
    }
}
