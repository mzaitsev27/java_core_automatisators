package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.interfaces_2;

public interface MoneyGivable {

    float GOOD_RATE = 1.1f;
    float BAD_RATE = 0.5f;
    int DO_NOTHING_ON_CLOSE = 0;

    default void giveMoney(){
        System.out.println("sdsd");
    }

}
