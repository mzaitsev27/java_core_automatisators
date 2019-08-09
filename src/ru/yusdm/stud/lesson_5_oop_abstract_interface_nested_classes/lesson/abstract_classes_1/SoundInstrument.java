package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.abstract_classes_1;

public abstract class SoundInstrument {

    protected String name;
    protected int price;

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
