package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.homework.book;

public class PrintedBook extends Book {
    private String fontFamily;

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "fontFamily='" + fontFamily + '\'' +
                '}';
    }
}
