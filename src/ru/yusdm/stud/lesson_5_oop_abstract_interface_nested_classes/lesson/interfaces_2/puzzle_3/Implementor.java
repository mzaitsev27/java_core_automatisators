package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.interfaces_2.puzzle_3;

public class Implementor implements A, B {

    @Override
    public void f() {
        A.super.f();
        B.super.f();
        System.out.println("This is implementor");
    }

}
